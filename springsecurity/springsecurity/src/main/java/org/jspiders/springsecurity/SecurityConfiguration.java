package org.jspiders.springsecurity;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    //Authentication
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder user=User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser((user.username("akshay").password("123").roles("ADMIN")))
                .withUser((user.username("pranit").password("ps123").roles("EMPLOYEE")));
    }

    //Authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/employee").hasAnyRole("EMPLOYEE","ADMIN")
                .antMatchers("/").permitAll()
                .and().formLogin();
    }
}
