package com.springbootwebApp.myFirstWebApp.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.jasper.tagplugins.jstl.core.ForEach;


public class Main {
	public static void main(String[] args) {
		List<Employee> empList = getEmpList();
		for(Employee e : empList) {
			if (e.getLastName().startsWith("B")) {
			//System.out.println(e.getEmpId()+ " :"+e.getLastName().replace('B', 'C') );

			}
		}
		
	List<Employee> lis =empList.stream().filter(e ->e.getLastName().startsWith("B")).collect(Collectors.toList());
	
	lis.forEach(System.out::println);
	System.out.println("\n ===========================================================================================");
	empList.stream().filter(e -> e.getSalary()>100000).forEach(System.out::println);
	//forEach(e -> System.out.println(e.getSalary()>15000));

	}
	
	public static List<Employee> getEmpList() {
		return Arrays.asList(
				new Employee("59-385-1088", "Zacharias", "Schwerin", "zchwerin@gmail.com", "Male", "True", 101146, 0),
				new Employee("73-274-6476", "Kyle", "Frudd", "kfrudd1@ovh.net", "Male", "FALSE", 29310, 2),
				new Employee("85-939-9584", "Axe", "Gumb", "agumb2@twitter.com", "Female", "FALSE", 62291, 4),
				new Employee("08-180-8292", "Robinet", "Batterham", "rbatterham3@last.fm", "Male", "FALSE", 142439, 4),
				new Employee("21-825-2623", "Ulick", "Burrel", "uburrel4@google.ru", "Male", "FALSE", 128764, 5),
				new Employee("66-708-5539", "Tailor", "Ridding", "Ridding", "Female", "FALSE", 152924, 4),
				new Employee("81-697-2363", "Joete", "Braybrooke", "jbraybrooke6@prnewswire.com", "Male", "TRUE",
						128907, 0),
				new Employee("63-019-1110", "Elroy", "Baverstock", "ebaverstock7@ehow.com", "Male", "TRUE", 2510, 0));
	}
}