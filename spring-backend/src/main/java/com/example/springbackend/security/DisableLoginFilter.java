package com.example.springbackend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

//THIS CONFIG IS FOR DEVELOPMNET ONLY, IT IS NOT SUITABLE FOR PRODUCTION -B 27.06.2023
//The purpose of this config is to disable login screen on "\" URL adress.
@Configuration
public class DisableLoginFilter{
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring()
                .requestMatchers("/");
    }
}
