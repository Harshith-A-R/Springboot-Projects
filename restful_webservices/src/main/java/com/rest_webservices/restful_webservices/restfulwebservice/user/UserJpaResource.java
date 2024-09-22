package com.rest_webservices.restful_webservices.restfulwebservice.user;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserJpaResource {

	//private UserDaoServices services;
	private UserRepository repository; 
	
	private PostRepository postrepository; 


	public UserJpaResource( UserRepository repository,PostRepository  postrepository) {
		super();
		//this.services = services;
		this.repository=repository;
		this.postrepository=postrepository;
	}

	@GetMapping("/jpa/users")
	public List<User> retreiveAll() {
		//return services.findAll();
		return repository.findAll();
	}

	@GetMapping("/jpa/users/{id}")
	public EntityModel<User> retrieveUser(@PathVariable int id) {
		
		Optional<User> user = repository.findById(id);
		
		
		/*if (user.isEmpty()) {
			throw new UserNotFoundException("id:" + id);
		}
		return user;*/
		
		
		if (user.isEmpty()) 
			throw new UserNotFoundException("id:" + id);
		//this entity model 	
		EntityModel<User> entityModel = EntityModel.of(user.get());
		//used to create link to all users and give 
		WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).retreiveAll());
		entityModel.add(link.withRel("all-users"));
		
		return entityModel;
	}

	
	
	@PostMapping("/jpa/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = repository.save(user);
		// location -http header
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();

		return ResponseEntity.created(location).build();
		// response entity is aclass which is used to return http status like 201 for
		// created,200 success etc.
	}

	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/jpa/users/{id}/posts")
	public List<Post> retreivePostForUser(@PathVariable int id) {
		Optional<User> user = repository.findById(id);
		if (user.isEmpty()) 
			throw new UserNotFoundException("id:" + id);
			return user.get().getPosts();
		
	}
	
	
	@PostMapping("/jpa/users/{id}/posts")
	public ResponseEntity<Object> createPostForUser(@PathVariable int id, @Valid @RequestBody Post post ) {
		Optional<User> user = repository.findById(id);
		if (user.isEmpty()) 
			throw new UserNotFoundException("id:" + id);
			post.setUser(user.get());
			Post savedPost =postrepository.save(post);
			
			URI location = ServletUriComponentsBuilder
					.fromCurrentRequest()
					.path("/{id}")
					.buildAndExpand(savedPost.getId())
					.toUri();

			return ResponseEntity.created(location).build();
			
		
	}

}
