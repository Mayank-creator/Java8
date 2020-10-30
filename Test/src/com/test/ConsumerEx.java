package com.test;

import java.util.function.Consumer;

class Movie
{
	String name;
	String result;
	public Movie(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
}
public class ConsumerEx {
	
	public static void main(String... args)
	{
		/*
		 * Consumer<String> consumer = s->System.out.println(s);
		 * consumer.accept("Mayank");
		 */
		
		//Consumer Chaining
		Consumer<Movie> consumer1 = movie->System.out.println("Movie:"+movie.name+" is ready to release");
		Consumer<Movie> consumer2 = movie->System.out.println("Movie:"+movie.name+" is just Released and it is:"+movie.result);
		Consumer<Movie> consumer3 = movie->System.out.println("Movie:"+movie.name+" information storing in the database");
		Consumer<Movie> chainConsumer = consumer1.andThen(consumer2).andThen(consumer3);
		Movie m1= new Movie("Bahubali","Hit");
		chainConsumer.accept(m1);
		Movie m2= new Movie("Spider","Flop");
		chainConsumer.accept(m2);
	}

}
