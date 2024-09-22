package com.springBootProject.learnSpringbootRestAPI;

public class Course {
	private long id;
	String course;
	String author;

	public Course(long id, String course, String author) {
		super();
		this.id = id;
		this.course = course;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getCourse() {
		return course;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Course [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
