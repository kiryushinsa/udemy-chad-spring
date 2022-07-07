package com.kiryushinsa.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // add users for in memory authentication. now deprecated in spring security
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        
        auth.inMemoryAuthentication()
                .withUser(users.username("john").password("test").roles("EMPLOYEE"))
                .withUser(users.username("cate").password("cat").roles("EMPLOYEE","MANAGER"))
                .withUser(users.username("admin").password("admin").roles("ADMIN","MANAGER","EMPLOYEE"));
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasRole("EMPLOYEE")
                .antMatchers("/leaders/**").hasRole("MANAGER")
                .antMatchers("/systems/**").hasRole("ADMIN")
                .and()
                .formLogin()
                    .loginPage("/loginPage") // адрес endpoint формы-ввода логина-пароля
                    .loginProcessingUrl("/authenticateUser") // форма(endpoint) для отображения после аутентификация
                    .permitAll() // каждый должен быть авторизован
                    .and().logout().permitAll()
                    .and()
                    .exceptionHandling().accessDeniedPage("/access-denied");
        
    }
    
    
}
