package com.rest_webservices.restful_webservices.restfulwebservice.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOFPerson() {
		return new PersonV1("Bod Charlie");
	}
	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOFPerson() {
		return new PersonV2(new Name("Bod", "Charlie"));
	}
	@GetMapping(path ="/person", params ="version=v1")
	public PersonV1 getFirstVersionOFPersonRequest() {
		return new PersonV1("Bod Charlie");
	}
	@GetMapping(path= "person", params="version=v2")
	public PersonV2 getSecondVersionOFPersonRequest() {
		return new PersonV2(new Name("Bod", "Charlie"));
	}
	@GetMapping(path ="/person/header", headers  ="X-API-VERSION=1")
	public PersonV1 getFirstVersionOFPersonRequestHeader() {
		return new PersonV1("Bod Charlie");
	}
	@GetMapping(path= "person/header", headers="X-API-VERSION=2")
	public PersonV2 getSecondVersionOFPersonRequestHeader() {
		return new PersonV2(new Name("Bod", "Charlie"));
	}
}
