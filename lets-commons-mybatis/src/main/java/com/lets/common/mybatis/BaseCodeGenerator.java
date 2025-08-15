package com.lets.common.mybatis;

import cn.hutool.core.util.StrUtil;
import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig.Builder;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.fill.Column;
import com.lets.common.mybatis.templates.MybatisPlusBaseController;
import com.lets.common.mybatis.templates.MybatisPlusBaseService;
import com.lets.common.mybatis.templates.MybatisPlusBaseServiceImpl;
import com.lets.platform.common.pojo.util.YamlUtil;
import com.lets.platform.model.base.BaseEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BaseCodeGenerator {
    static final String PACKAGE_PARENT = "com.lets.platform";
    static final String ENTITY_PACKAGE_PARENT = PACKAGE_PARENT + ".model";
    static final String SRC_DIR = "/src/main/java";
    static final String NACOS_ADDRESS = "10.0.2.154:8848";
    static final String NACOS_GROUP = "DEFAULT_GROUP";
    static final String NACOS_NAMESPACE = "ee587aa9-0c03-42dd-85ed-1108dba9061a";
    static String SERVICE_NAME = null;
    static String OS = System.getProperty("os.name").toLowerCase();
    static Class<? extends BaseCodeGenerator> CLAZZ = null;


    // 获取配置
    public static Builder getNacosConfig() throws NacosException {
        String dataId = SERVICE_NAME + ".yaml";
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.SERVER_ADDR, NACOS_ADDRESS);
        properties.put(PropertyKeyConst.NAMESPACE, NACOS_NAMESPACE);
        ConfigService configService = NacosFactory.createConfigService(properties);
        String config = configService.getConfig(dataId, NACOS_GROUP, 5000);
        YamlUtil yaml = new YamlUtil(config);
        String url = yaml.getValueByKey("spring.datasource.url", "");
        String username = yaml.getValueByKey("spring.datasource.username", "");
        String password = yaml.getValueByKey("spring.datasource.password", "");
        if ("common".equals(SERVICE_NAME)) {
            url = yaml.getValueByKey("spring.datasource.dynamic.datasource.master.url", "");
            username = yaml.getValueByKey("spring.datasource.dynamic.datasource.master.username", "");
            password = yaml.getValueByKey("spring.datasource.dynamic.datasource.master.password", "");
        }
        return new Builder(url, username, password);
    }

    public static String getOutPutDir() {
        StringBuilder dir = new StringBuilder();
        String absPath = BaseCodeGenerator.class.getResource("/").getPath();
        String[] paths = absPath.split("/target", 0);
        dir.append(paths[0]);
        dir.append(SRC_DIR);
        return dir.toString();
    }

    public static String getPackageName() {
        return CLAZZ.getPackage().getName();
    }

    public static Map<OutputFile, String> getPathInfo() {
        String entityPath = getEntityPath();
        String dir = getOutPutDir();
        String packageName = getPackageName();
        String pkgDir = "/" + packageName.replace('.', '/');
        String resources = dir.split("java")[0];
        Map<OutputFile, String> pathInfo = new HashMap<>(6);
        pathInfo.put(OutputFile.entity, entityPath);
        pathInfo.put(OutputFile.mapper, dir + pkgDir + "/dao/");
        pathInfo.put(OutputFile.xml, resources + (isMacOs() ? "resources/mybatis/mapper" : "resources\\mybatis\\mapper"));
        pathInfo.put(OutputFile.controller, dir + pkgDir + "/controller");
        pathInfo.put(OutputFile.service, dir + pkgDir + "/service");
        pathInfo.put(OutputFile.serviceImpl, dir + pkgDir + "/service/impl");
        return pathInfo;
    }

    // 获取实体类目录
    public static String getEntityPath() {
        String parentPackagePath =
                BaseCodeGenerator.class.getResource("/" + ENTITY_PACKAGE_PARENT.replace(".", "/")).getPath();
        return parentPackagePath.split("/target/")[0]
                + SRC_DIR
                + "/"
                + ENTITY_PACKAGE_PARENT.replace(".", "/")
                + "/"
                + SERVICE_NAME
                + "/"
                + "entity";
    }

    public static String lowerCaseFirstLetter(String input) {
        if (StrUtil.isEmpty(input)) {
            return input;
        }
        return Character.toLowerCase(input.charAt(0)) + input.substring(1);
    }

    public static void codeGenerator(String serviceName, Class<? extends BaseCodeGenerator> clazz) throws NacosException {
        SERVICE_NAME = serviceName;
        CLAZZ = clazz;
        Builder dataSourceConfig = getNacosConfig();
        FastAutoGenerator.create(dataSourceConfig)
                // 全局配置
                .globalConfig(
                        (scanner, builder) ->
                                builder
                                        .author(scanner.apply("请输入作者名称"))
                                        .disableOpenDir()
                                        .enableSwagger()
                                        .commentDate("yyyy-MM-dd")
                                        .outputDir(getOutPutDir()))
                // 包配置
                .packageConfig(
                        (scanner, builder) ->
                                builder
                                        .parent(PACKAGE_PARENT)
                                        .controller(SERVICE_NAME + ".service.controller")
                                        .entity("model." + SERVICE_NAME + ".entity")
                                        .mapper(SERVICE_NAME + ".service.dao")
                                        .service(SERVICE_NAME + ".service.service")
                                        .serviceImpl(SERVICE_NAME + ".service.service.impl")
                                        .pathInfo(getPathInfo()))
                // 策略配置
                .strategyConfig(
                        (scanner, builder) ->
                                builder
                                        .addInclude(scanner.apply("请输入表名，多个表名用,隔开"))
                                        // 实体类配置
                                        .entityBuilder()
                                        .disableSerialVersionUID()
                                        .naming(NamingStrategy.underline_to_camel)
                                        .enableLombok()
                                        .superClass(BaseEntity.class)
                                        .enableTableFieldAnnotation()
                                        .idType(IdType.ASSIGN_ID)
                                        .addTableFills(new Column("deleted", FieldFill.INSERT))
                                        // controller配置
                                        .controllerBuilder()
                                        .superClass(MybatisPlusBaseController.class)
                                        .enableRestStyle()
                                        // service配置
                                        .serviceBuilder()
                                        .formatServiceFileName("%sService")
                                        .superServiceClass(MybatisPlusBaseService.class)
                                        .superServiceImplClass(MybatisPlusBaseServiceImpl.class)
                                        // mapper配置
                                        .mapperBuilder()
                                        .enableBaseResultMap()
                                        .enableBaseColumnList())
                .templateConfig(
                        (scanner, builder) ->
                                builder
                                        .controller("/templates/lets-controller.java")
                                        .serviceImpl("/templates/lets-serviceImpl.java")
                                        .entity("/templates/lets-entity.java"))
                .injectionConfig((builder) -> builder.beforeOutputFile((tableInfo, objectMap) -> {
                    String lowerCaseServiceName = lowerCaseFirstLetter(tableInfo.getServiceName());
                    String lowerCaseMapperName = lowerCaseFirstLetter(tableInfo.getMapperName());
                    objectMap.put("lowerCaseServiceName", lowerCaseServiceName);
                    objectMap.put("lowerCaseMapperName", lowerCaseMapperName);
                }))
                .execute();
    }

    private static boolean isMacOs() {
        return OS.contains("mac") && OS.contains("os");
    }
}
