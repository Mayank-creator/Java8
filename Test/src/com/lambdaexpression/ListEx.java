package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sort list in descending order
 * @author msgaur
 *
 */
class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2)
		{
			return 1;
		}
		else if(o1==02)
		{
			return 0;
		}
		else
		{
			return -1;
			
		}
	}
	
}
public class ListEx {

	//TIll Java 7
	/*
	 * public static void main(String... args) { List<Integer> list = new
	 * ArrayList<Integer>(); list.add(10); list.add(0); list.add(15); list.add(5);
	 * list.add(20); Collections.sort(list, new MyComparator());
	 * System.out.println(list); }
	 */
	
	//Using Lambda expression
	public static void main(String... args)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		Collections.sort(list, (o1,o2)->o1 <o2?1:(o1==o2?0:-1));
		System.out.println(list);
	}
}
