package com.test;

import java.util.function.Function;

public class FunctionEx {

	public static void main(String... args) {
		// print length of string
		/*
		 * Function<String, Integer> function = s-> s.length();
		 * System.out.println(function.apply("test"));
		 */

		// remove spaces using string
		/*
		 * String s = "My name is Mayank"; Function<String, String> function =
		 * s1->s1.replaceAll(" ", ""); System.out.println(function.apply(s));
		 */

		// Function chaining
		/*
		 * String s1 = "Mayank Gaur"; Function<String,String> f1 = s->s.toUpperCase();
		 * Function<String,String> f2 = s->s.substring(0, 9);
		 * System.out.println(f1.andThen(f2).apply(s1));
		 * System.out.println(f1.andThen(f2).apply(s1));
		 */
		/*
		 * Function<Integer, Integer> f1 = i->i + i; Function<Integer, Integer> f2 =
		 * i->i * i * i; System.out.println(f1.compose(f2).apply(2));
		 * System.out.println(f1.andThen(f2).apply(2));
		 */
		//Function interface static method
		Function<String, String> f1 = Function.identity();
		System.out.println(f1.apply("MayanK"));
	}

}
