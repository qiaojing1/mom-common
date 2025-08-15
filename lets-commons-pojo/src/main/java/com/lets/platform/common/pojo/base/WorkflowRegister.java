package com.lets.platform.common.pojo.base;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.annotation.FlowAction;
import com.lets.platform.common.pojo.annotation.FlowAtom;
import com.lets.platform.common.pojo.annotation.FlowFormConfiguration;
import com.lets.platform.common.pojo.annotation.ItemsScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * 流程启动注册服务
 *
 * @author FZY
 * @since 2023-11-10
 */
@Component(value = "workflowRegister")
public class WorkflowRegister implements ImportBeanDefinitionRegistrar, ResourceLoaderAware, BeanClassLoaderAware, EnvironmentAware {
    private static final Logger logger = LoggerFactory.getLogger(WorkflowRegister.class);


    private ResourceLoader resourceLoader;

    private ClassLoader classLoader;

    private Environment environment;

    /**
     * 获取实现了的接口方法（如果存在）
     *
     * @param method    实现类中的方法
     * @param className 实现类的名称
     * @return 对应的接口方法，如果存在
     */
    private static Method getInterfaceMethod(Method method, String className) {
        try {
            Class<?> clazz = Class.forName(className);
            for (Class<?> iFace : clazz.getInterfaces()) {
                try {
                    return iFace.getDeclaredMethod(method.getName(), method.getParameterTypes());
                } catch (NoSuchMethodException e) {
                    // 当前接口没有这个方法，继续检查下一个接口
                }
            }
        } catch (ClassNotFoundException e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    @Override
    public void setBeanClassLoader(@NonNull ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @Override
    public void setEnvironment(@NonNull Environment environment) {
        this.environment = environment;
    }

    @Override
    public void setResourceLoader(@NonNull ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void registerBeanDefinitions(@NonNull AnnotationMetadata importingClassMetadata, @NonNull BeanDefinitionRegistry registry, @NonNull BeanNameGenerator importBeanNameGenerator) {
        packageScan(importingClassMetadata);
        registerItems(importingClassMetadata, registry);
    }

    @Override
    public void registerBeanDefinitions(@NonNull AnnotationMetadata importingClassMetadata, @NonNull BeanDefinitionRegistry registry) {

    }

    private void packageScan(AnnotationMetadata metadata) {
        Map<String, Object> defaultAttrs = metadata.getAnnotationAttributes(ItemsScan.class.getName(), true);
        if (defaultAttrs != null && !defaultAttrs.isEmpty()) {
            logger.info("flow atom package scan: " + buildPackages((String[]) defaultAttrs.get("basePackages")));
        }
    }

    private String buildPackages(String[] basePackages) {
        if (basePackages == null || basePackages.length == 0) {
            return "none";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : basePackages) {
            stringBuilder.append(s).append(",");
        }
        ;
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }

    public void registerItems(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        ClassPathScanningCandidateComponentProvider scanner = getScanner();
        scanner.setResourceLoader(this.resourceLoader);
        Set<String> basePackages;
        AnnotationTypeFilter FlowActionAnnotationTypeFilter = new AnnotationTypeFilter(FlowAction.class);
        AnnotationTypeFilter FlowAtomAnnotationTypeFilter = new AnnotationTypeFilter(FlowAtom.class);
        scanner.addIncludeFilter(FlowActionAnnotationTypeFilter);
        scanner.addIncludeFilter(FlowAtomAnnotationTypeFilter);
        basePackages = getBasePackages(metadata);

        for (String basePackage : basePackages) {
            Set<BeanDefinition> candidates = new LinkedHashSet<>();
            ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
            try {
                // 这里特别注意一下类路径必须这样写
                // 获取指定包下的所有类
                basePackage = basePackage.replace(".", "/");
                Resource[] resources = resourcePatternResolver.getResources("classpath*:" + basePackage);

                MetadataReaderFactory metadataReaderFactory = new SimpleMetadataReaderFactory();
                for (Resource resource : resources) {
                    if (StrUtil.isNotEmpty(resource.getFilename()) && resource.getFilename().contains(".class")) {
                        //只扫类,不扫包
                        MetadataReader metadataReader = metadataReaderFactory.getMetadataReader(resource);
                        ScannedGenericBeanDefinition beanDefinition = new ScannedGenericBeanDefinition(metadataReader);
                        beanDefinition.setResource(resource);
                        beanDefinition.setSource(resource);
                        candidates.add(beanDefinition);
                    }
                }

                //扫描 FlowAction、FlowAtom、FlowFormConfiguration 注解
                for (BeanDefinition beanDefinition : candidates) {
                    String classname = beanDefinition.getBeanClassName();
                    FlowAction flowAction = Class.forName(classname).getAnnotation(FlowAction.class);
                    FlowAtom flowAtom = Class.forName(classname).getAnnotation(FlowAtom.class);
                    FlowFormConfiguration flowFormConfiguration = Class.forName(classname).getAnnotation(FlowFormConfiguration.class);
                    if (flowAction != null) {
                        String menuCode = flowAction.menuCode();
                        this.registerFlowAction(menuCode, classname);
                    }
                    if (flowAtom != null) {
                        String menuCode = flowAtom.menuCode();
                        this.registerFlowAtom(menuCode, classname);
                    }
                    if (flowFormConfiguration != null) {
                        String menuCode = flowFormConfiguration.menuCode();
                        this.registerFlowFormConfiguration(menuCode,flowFormConfiguration);
                    }
                }
            } catch (Exception e) {
                logger.error("workflow register exception");
            }
        }
    }

    private void registerFlowAction(String menuCode, String className) throws ClassNotFoundException {
        Method[] methods = Class.forName(className).getDeclaredMethods();
        for (Method method : methods) {
            FlowAction action = method.getAnnotation(FlowAction.class);
            if (action == null) {
                Method interfaceMethod = getInterfaceMethod(method, className);
                if (interfaceMethod != null) {
                    action = interfaceMethod.getAnnotation(FlowAction.class);
                }
            }
            if (action != null) {
                FlowActionManager.register(menuCode, action, method);
            }
        }
    }

    private void registerFlowAtom(String menuCode, String className) throws ClassNotFoundException {
        Method[] methods = Class.forName(className).getDeclaredMethods();
        for (Method method : methods) {
            FlowAtom atom = method.getAnnotation(FlowAtom.class);
            if (atom != null) {
                FlowAtomManager.register(menuCode, atom, method);
            }
        }
    }

    private void registerFlowFormConfiguration(String menuCode,FlowFormConfiguration flowFormConfiguration) {
        FlowFormConfigManager.register(menuCode,flowFormConfiguration);
    }

    protected ClassPathScanningCandidateComponentProvider getScanner() {

        return new ClassPathScanningCandidateComponentProvider(false, this.environment) {

            @Override
            protected boolean isCandidateComponent(@NonNull AnnotatedBeanDefinition beanDefinition) {
                if (beanDefinition.getMetadata().isIndependent()) {

                    if (beanDefinition.getMetadata().isInterface() && beanDefinition.getMetadata().getInterfaceNames().length == 1 && Annotation.class.getName().equals(beanDefinition.getMetadata()
                                                                                                                                                                                      .getInterfaceNames()[0])) {
                        try {
                            Class<?> target = ClassUtils.forName(beanDefinition.getMetadata().getClassName(), WorkflowRegister.this.classLoader);
                            return !target.isAnnotation();
                        } catch (Exception ex) {
                            this.logger.error("Could not load target class: " + beanDefinition.getMetadata().getClassName(), ex);
                        }
                    }
                    return true;
                }
                return false;
            }
        };
    }

    protected Set<String> getBasePackages(AnnotationMetadata importingClassMetadata) {
        Map<String, Object> attributes = importingClassMetadata.getAnnotationAttributes(ItemsScan.class.getCanonicalName());

        Set<String> basePackages = new HashSet<>();
        if (attributes != null) {
            for (String basePackage : (String[]) attributes.get("basePackages")) {
                if (StrUtil.isNotEmpty(basePackage)) {
                    basePackages.add(basePackage);
                }
            }
        }

        if (basePackages.isEmpty()) {
            basePackages.add(ClassUtils.getPackageName(importingClassMetadata.getClassName()));
        }

        return basePackages;
    }


}
