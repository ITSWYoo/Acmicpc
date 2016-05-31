package SortAlgo;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10825
public class Sort10814 {
	private Scanner sc = new Scanner(System.in);
	private class Person implements Comparable<Person> {
		private int age;
		private String name;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		@Override
		public int compareTo(Person o) {
			// TODO Auto-generated method stub
			if(getAge()>o.getAge()) return 1;
			if(getAge()<o.getAge()) return -1;
			return 0;
		}
	}
	private void mySort()
	{
		int n = sc.nextInt();
		Person[] p = new Person[n];
		for(int i = 0 ; i<n ; i++)
		{
			p[i] = new Person(sc.nextInt(), sc.next());
		}
		Arrays.sort(p);
		for(int i = 0 ; i<n; i++)
		{
			System.out.println(p[i].getAge()+" "+p[i].getName());
		}
	}
	public static void main(String args[])
	{
		new Sort10814().mySort();
	}
}
