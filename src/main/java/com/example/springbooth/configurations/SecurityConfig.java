package com.example.springbootthymeleaf.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(@Qualifier("customUserDetailsService") final UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected UserDetailsService userDetailsService() {
        return userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

//import com.example.springbootthymeleaf.UserDetailsAdapter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final UserDetailsService userDetailsService;
//
//    public SecurityConfig(@Qualifier("customUserDetailsService") final UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Override
//    protected UserDetailsService userDetailsService() {
//        return userDetailsService;
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}

//    @Override
//    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("user1").password("$2a$10$w6AoSvH7ezHwQomG19OjOev3AZuu/UWkROR5CjW1fXZjvP/dy9mEq").roles("ADMIN")
//                .and()
//                .withUser("user2").password("$2a$10$V/kkkDd5jXR1Y/mbmrneIePEsgHcXteNr41IwoFWzKQxUeeV1a.q2").roles("SUPER_ADMIN");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests()
////                .antMatchers("/student/**").authenticated()
//                .antMatchers(HttpMethod.GET, "/index").authenticated()
//                .antMatchers(HttpMethod.GET, "/register-student").authenticated()
//                .antMatchers(HttpMethod.POST, "/addstudent").authenticated()
//                .anyRequest().permitAll()
//                .and()
//                .formLogin()
//                .and()
//                .httpBasic()
//                .and()
//                .logout()
////                .and()
////                .sessionManagement()
////                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .csrf().disable();
//    }
