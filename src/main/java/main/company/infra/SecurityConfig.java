package main.company.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")	//Admin 권한이 있는 경우 접근 허용
                .antMatchers("/user/**").hasRole("USER")	//User 권한이 있는 경우 접근 허용
                .antMatchers("/", "/home", "/signUp", "/signIn", "/static/images/**").permitAll() //해당 URL은 전체 접근 허용
                .anyRequest().authenticated()	//이외의 URL은 인증 절차를 수행하기 위해 login 페이지로 이동
                .and().csrf().disable()
                .formLogin()            //로그인 수행
                .loginPage("/login")
                .permitAll()
                .and()
                .logout()               //로그아웃 수행
                .permitAll();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
