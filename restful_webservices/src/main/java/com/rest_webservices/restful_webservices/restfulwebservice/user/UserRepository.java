package com.rest_webservices.restful_webservices.restfulwebservice.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	

}
