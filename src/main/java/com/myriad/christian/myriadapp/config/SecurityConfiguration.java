package com.myriad.christian.myriadapp.config;

import com.myriad.christian.myriadapp.repositories.MyriadRepo;
import com.myriad.christian.myriadapp.service.imple.MyriadsUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
@EnableWebSecurity
@Configuration
//@EnableJpaRepositories(basePackageClasses = MyriadRepo.class)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(encodePWD());
    }

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Autowired
    private MyriadsUserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
//    @Autowired
//    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.userDetailsService(userDetailsService)
//                .passwordEncoder(encodePWD());
//
//        }
        public BCryptPasswordEncoder encodePWD() {
            return new BCryptPasswordEncoder();
        }



    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("**/secured/**").authenticated()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/js/**").permitAll()
                .antMatchers("/newsfeed/newsfeed").permitAll()
                .antMatchers("/users/activate/**").permitAll()
                .antMatchers("/myriad/save").permitAll()
                .antMatchers("/images/**").permitAll()
                .antMatchers("/layouts/**").permitAll()
                .antMatchers("/fonts/**").permitAll()
                .antMatchers("/user/create-new-account").permitAll()
                .antMatchers("/users/login/**").permitAll()
                .antMatchers("/all").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/users/login").permitAll()
                .defaultSuccessUrl("/user/feeds")
        .and()
                .logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/users/login?logout")
                .permitAll().invalidateHttpSession(true)
                .and()
                .exceptionHandling()
        .accessDeniedPage("/user/error");

    }
}
