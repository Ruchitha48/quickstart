package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("india").
		password(encoder.encode("india")).roles("ADMIN").and().
		withUser("nepal").password(encoder.encode("nepal")).roles("Guest");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeHttpRequests().antMatchers("/api/v1/students/**").
//		permitAll().
//		and().authorizeRequests().antMatchers("/api/v1/teachers/**").authenticated().and().httpBasic();
		
		http.authorizeHttpRequests().antMatchers("/api/v1/students/**").
		permitAll().
		and().authorizeRequests().antMatchers("/api/v1/teachers/**").hasAnyRole("ADMIN").antMatchers("/api/v1/staff/**").hasAnyRole("ADMIN","Guest").and().httpBasic();
			
		
	}

@Autowired
BCryptPasswordEncoder encoder;
}
