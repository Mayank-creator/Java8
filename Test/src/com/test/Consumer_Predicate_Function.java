package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class Consumer_Predicate_Function {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		populate(list);
		Predicate<Student> predicate = student -> student.marks >= 60;
		Function<Student, String> function = student -> {
			int marks = student.marks;
			if (marks >= 80) {
				return "Distinction";
			} else if (marks >= 60) {
				return "First Class";
			} else if (marks >= 50) {
				return "Second Class";
			} else if (marks >= 35) {
				return "Third Class";
			} else {
				return "Failed";
			}
		};
		Consumer<Student> consumer = student->{
			System.out.println("Student Name: "+student.name);
			System.out.println("Student Name: "+student.marks);
			System.out.println("Student Name: "+function.apply(student));
		};
		for(Student s: list)
		{
			if(predicate.test(s))
			{
				consumer.accept(s);
			}
		}
	}

	public static void populate(List<Student> list) {
		list.add(new Student("Sunny", 100));
		list.add(new Student("Bunny", 65));
		list.add(new Student("Chinny", 55));
		list.add(new Student("Vinny", 45));
		list.add(new Student("Pinny", 25));
	}

}
