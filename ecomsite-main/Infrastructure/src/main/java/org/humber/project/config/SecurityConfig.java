/*
 * package org.humber.project.config;
 * 
 * import org.springframework.context.annotation.Configuration;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfiguration;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfiguration;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity
 * public class SecurityConfig extends WebSecurityConfiguration {
 * 
 * @Override
 * protected void configure(HttpSecurity http) throws Exception {
 * http
 * .authorizeRequests()
 * .antMatchers("/userPage").authenticated() // Allow access to "/userPage" only
 * for authenticated users
 * .anyRequest().permitAll() // Allow access to all other endpoints without
 * authentication
 * .and()
 * .formLogin() // Use form-based authentication
 * .loginPage("/login") // Specify the login page URL
 * .permitAll(); // Allow access to the login page without authentication
 * }
 * 
 * // Other security configuration methods (e.g., authentication manager, user
 * // details service) can be added here
 * }
 */