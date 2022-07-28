package com.example.otherresourceserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
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

//    @Value("${spring.security.oauth2.resourceserver.opaque-token.introspection-uri}")
//    String introspectionUri;
//
//    @Value("${spring.security.oauth2.resourceserver.opaque-token.client-id}")
//    String clientId;
//
//    @Value("${spring.security.oauth2.resourceserver.opaque-token.client-secret}")
//    String clientSecret;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(auths -> auths
                        .antMatchers(HttpMethod.GET, "/data")
                        .authenticated())
                .oauth2ResourceServer(oauth2 -> oauth2
                        .opaqueToken(opaqueToken -> opaqueToken
                                .introspectionUri("http://localhost:9000/oauth2/introspect")
                                .introspectionClientCredentials("app-client", "test")
                        )
                );
//                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
        return http.build();
    }

}
