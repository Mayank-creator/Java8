package com.lambdaexpression;

import java.util.TreeSet;

public class SetEx {
	
	public static void main(String... args)
	{
		TreeSet<Integer> set = new TreeSet<Integer>((o1,o2)->o1 <o2?1:(o1==o2?0:-1));
		set.add(10);
		set.add(0);
		set.add(15);
		set.add(25);
		set.add(5);
		System.out.println(set);
	}

}
