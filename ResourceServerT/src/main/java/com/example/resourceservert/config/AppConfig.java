package com.example.resourceservert.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AppConfig {

//    @Value("${oauth2.check-token-url}")
//    private String checkTokenUrl;
//
//    @Value("${oauth2.resource-id}")
//    private String resourceId;
//
//    @Value("${oauth2.client-id}")
//    private String clientId;
//
//    @Value("${oauth2.client-secret}")
//    private String clientSecret;


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(auths -> auths
                        .antMatchers(HttpMethod.GET, "/resource").authenticated())
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
        return http.build();
    }

}
