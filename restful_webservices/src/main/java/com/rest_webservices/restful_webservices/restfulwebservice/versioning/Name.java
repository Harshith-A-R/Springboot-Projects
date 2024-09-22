package com.rest_webservices.restful_webservices.restfulwebservice.versioning;

public class Name {
private String fristName;
private String secondName;
public Name(String fristName, String secondName) {
	super();
	this.fristName = fristName;
	this.secondName = secondName;
}
public String getFristName() {
	return fristName;
}
public String getSecondName() {
	return secondName;
}
@Override
public String toString() {
	return "Name [fristName=" + fristName + ", secondName=" + secondName + "]";
}



}
