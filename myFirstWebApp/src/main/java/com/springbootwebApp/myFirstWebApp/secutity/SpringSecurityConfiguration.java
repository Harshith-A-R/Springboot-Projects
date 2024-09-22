package com.springbootwebApp.myFirstWebApp.secutity;
import static org.springframework.security.config.Customizer.withDefaults;
import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
public class SpringSecurityConfiguration {

	//Db-
	//inmememory
	
	//So now we are making use of Bcrypt password encoder  with Spring Security
	//we configured Spring Security with a specific username and password of our choice.
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManger() {
	
		String username = "harshith";
		String password = "9066";
		
		Function<String, String> passwordEncoder= input->passwordEncoder().encode(input);
	
		
		UserDetails userdetails= User.builder()
				.passwordEncoder(passwordEncoder)
		.username(username)
		.password(password)	
		.roles("USER","ADMIN")
		.build();
		return new InMemoryUserDetailsManager(userdetails);
	}
	
	
	//creating new user by creating new user method and all the logic in createUser DetailsManger method would be refactoring into new create New user method 
	
	/*@Bean
	public InMemoryUserDetailsManager createUserDetailsManger() {
	
		UserDetails userdetails1 = createNewUser("harshith", "9066");
		UserDetails userdetails2 = createNewUser("ragnor", "806699");

		
		return new InMemoryUserDetailsManager(userdetails1,userdetails2);
	}


	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder= input->passwordEncoder().encode(input);
	
		
		UserDetails userDetails= User.builder()
				.passwordEncoder(passwordEncoder)
		.username(username)
		.password(password)	
		.roles("USER","ADMIN")
		.build();
		return userDetails;
	}*/
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests( 
				auth->auth.anyRequest().authenticated());
		http.formLogin(withDefaults());
		
		http.csrf().disable();
		http.headers().frameOptions().disable();
		return http.build();
	}
	
}
