package cn.zycgod.oauth2.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableOAuth2Sso
public class Oauth2ClientApplication extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ClientApplication.class, args);
	}
	
	@Override
    public void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**")
        .authorizeRequests()
        .antMatchers("/", "/login**")
        .permitAll()
        .anyRequest()
        .authenticated();
    }
}
