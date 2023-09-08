package practice;

import java.util.*;

import mob.Pokemon;

public class PracticeClass {
	
	//List
	public void method01() {
		List al = new ArrayList();
		
		Pokemon p =new Pokemon();
		int num = 10;
		String str="hello";
		
		al.add(p);
		al.add(num);
		al.add(str);
		
		System.out.println(al);
		
		// al.add("안녕");
		// al.clear();
		boolean result =  al.contains(p);
		System.out.println(result);
		System.out.println(al);
		
	}
	//Set
	public void method02() {
		System.out.println("set==========");
		
		HashSet s = new HashSet();
		
		s.add("one");
		s.add("two");
		s.add("three");
		s.add(4);
		s.add(5);

		System.out.println(s);
		 
	}

	//Map
	public void method03() {

		
	}
	
	//Stack
	public void method04() {

		
	}
		
	//Queue
	public void method05() {

		
		
	}
}
