//package com.project.bookexchange.config;
//
//import com.project.bookexchange.service.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//   @Autowired
//   private UserService userService;
//   @Override
//   protected void configure(HttpSecurity http) throws Exception {
//       http
//           .authorizeRequests()
//               .antMatchers("/", "/home", "/register", "/css/**", "/js/**").permitAll()
//               .anyRequest().authenticated()
//               .and()
//           .formLogin()
//               .loginPage("/login")
//               .permitAll()
//               .and()
//           .logout()
//               .permitAll();
//   }
//   @Autowired
//   public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//       auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
//   }
//   @Bean
//   public PasswordEncoder passwordEncoder() {
//       return new BCryptPasswordEncoder();
//   }
//}