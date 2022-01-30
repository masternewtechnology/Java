package com.java8.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferences {

	public static void main(String ar[]) {
		methodReferenceExample1();
	}
	public static void methodReferenceExample1() {
		List<User> users = Arrays.asList(new User(true, "User-A"), new User(true, "User-B"), 
				new User(true, "User-C"), new User(true, "User-D"), new User(false, "User-E"), new User(true, "User-F"));
		//Working with lambda expression
		long le_count = users.stream().filter(u -> User.isRealUserStaticMethod(u)).count();
		System.out.println(String.format("Result is %s using lambda expression", le_count));
		
		//Working with method reference
		long mr_count = users.stream().filter(User::isRealUserStaticMethod).count();
		System.out.println(String.format("Result is %s using method reference ", mr_count));
		
		//Same above example using object method variable
		//Working with lambda expression
		long le_count2 = users.stream().filter(u -> u.isRealUserInstanceMethod(u)).count();
		System.out.println(String.format("Result is %s using lambda expression", le_count2));
		
		//Working with method reference
		User u = new User();
		long mr_count2 = users.stream().filter(u::isRealUserInstanceMethod).count();
		System.out.println(String.format("Result is %s using method reference ", mr_count2));
		
	}
}
