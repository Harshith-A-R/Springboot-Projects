package com.rest_webservices.restful_webservices.restfulwebservice.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoServices {

	public static List<User> users = new ArrayList<User>();
	private static int userCount = 0;
	static {
		users.add(new User(++userCount, "Raghav", LocalDate.now().minusYears(30)));
		users.add(new User(++userCount, "Raman", LocalDate.now().minusYears(25)));
		users.add(new User(++userCount, "Radha", LocalDate.now().minusYears(27)));

	}

	public List<User> findAll() {
		return users;
	}
	//this  method perform to fetching single user details by passing id in the url
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		//return users.stream().filter(predicate).findFirst().get();
		return users.stream().filter(predicate).findFirst().orElse(null);
	}

	public User save(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	public void  deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
