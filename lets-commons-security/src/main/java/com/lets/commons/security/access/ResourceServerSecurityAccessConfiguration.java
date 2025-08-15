package com.lets.commons.security.access;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * ResourceServerSecurityAccessConfiguration
 *
 * @ClassName ResourceServerSecurityAccessConfiguration
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
@Slf4j
@Configuration
//@Conditional(EnableResourceServerCondition.class)
public class ResourceServerSecurityAccessConfiguration
//        extends ResourceServerConfigurerAdapter
{

//    @Resource
//    private CustomAccessDeniedHandler customAccessDeniedHandler;
//
//    @Resource
//    private CustomAuthExceptionEntryPoint customAuthExceptionEntryPoint;
//
//    public ResourceServerSecurityAccessConfiguration() {
//
//    }

    public static final String[] EXCLUDED_AUTH_PAGES = {
            "/user/userDetail",
            "/uc/user/find_by_username",
            "/user/find_by_username",
            "/user/editPassword",
            "/oauth/exit",
            "/uaa/oauth/swipe",
            "/oauth/swipe",
            "/uaa/oauth/token",
            "/oauth/token",
            "/auth/client/get_public_key",
            "/menuPermission/findPermission4Menu4User",
            "/doc.html",
            "/webjars/**",
            "/v2/api-docs",
            // 这个和下面两个要加上，否则无法访问后台api
            "/uc/v2/api-docs",
            "/auth/v2/api-docs",
            "/tpm/v2/api-docs",
            "/common/v2/api-docs",
            "/device/v2/api-docs",
            "/notification/v2/api-docs",
            "/collection/v2/api-docs",
            "/indexStatistics/deviceStatus",
            "/indexStatistics/deviceStatusByFactoryMode",
            "/indexStatistics/deviceStatusDuration",
            "/indexStatistics/deviceStatusDurationTop5",
            "/indexConfig/findByRelationType",
            "/psiIndexStatistic/findSalesAmount",
            "/psiIndexStatistic/findSalesReturnAmount",
            "/psiIndexStatistic/findMaterialStore",
            "/psiIndexStatistic/findWaitDeliver",
            "/psiIndexStatistic/findPurchaseExpend",
            "/psiIndexStatistic/findPurchaseExpend",
            "/psiIndexStatistic/findFollowWork",
            "/psiIndexConfig/findByRelationType",
            // 大屏start
            "/factoryMode/findById4Screen",
            "/device/findPage4BigScreen",
            "/deviceRealtimeStatus/findRealStatus4Screen",
            "/stationMachineDispatch/findDeviceProduce4Screen",
            "/produceOrder/findProduceOrderOverall",
            "/stationMachineDispatch/findDeviceLoadTop5",
            "/deviceHistoryStatus/findLastSevenDayDeviceStatusTrend",
            "/stationMachineDispatch/findTotalWorkNum4Screen",
            "/weather/getWeather",
            "weather/getWeatherFromGaoDe",
            // 大屏end
            "/currency/findById",
            "/deviceStatus/findTree",
            "/device/findCount",
            "/user/findCount",
            "/login/findCount",
            "/indexConfig/findByTypeInfoPage",
            "/calendar/findListByMonth",
            "/message/v2/api-docs",
            "/psi/v2/api-docs",
            "/mes/v2/api-docs",
            "/swagger-resources/configuration/ui",
            "/swagger-resources",
            "/swagger-resources/configuration/security",
            "/swagger-ui.html",
            "/static/**", "/druid/**", "/js/**", "/css/**", "/images/**", "/run/**"
    };

    /**
     * 注：如果在各自服务中配置了ResourceServerConfigurerAdapter，此处的配置会被覆盖
     * @param http
     * @throws Exception
     */
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable().authorizeRequests()
//                .antMatchers(EXCLUDED_AUTH_PAGES)
//                .permitAll()
//                .and()
//                .logout().permitAll()
//                .and().formLogin().permitAll()
//                .and()
//                .authorizeRequests().anyRequest().authenticated()
//                .filterSecurityInterceptorOncePerRequest(false)
//                .and().exceptionHandling()
//                .accessDeniedHandler(new OAuth2AccessDeniedHandler())
//                .and().exceptionHandling()
//                .authenticationEntryPoint(customAuthExceptionEntryPoint)
//                .accessDeniedHandler(customAccessDeniedHandler);
//        log.info("Security Access Control is enabled on Resource server Application");
//    }
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.authenticationEntryPoint(customAuthExceptionEntryPoint)
//                .accessDeniedHandler(customAccessDeniedHandler);
//    }
}
