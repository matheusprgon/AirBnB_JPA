package com.example.AuthService.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("Locador").password("{noop}123").roles("LOCADOR","LOCATARIO").and()
                .withUser("Locatario").password("{noop}123").roles("LOCATARIO");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests().antMatchers("/imoveis")
                .hasRole("LOCATARIO").antMatchers("/imoveis/**").hasRole("LOCADOR").and()
                .csrf().disable().headers().frameOptions().disable();
    }
}
