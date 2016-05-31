package SortAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/10825
public class Sort10825 {
	private void solve() {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		Student[] c = new Student[n];

		for (int i = 0; i < n; i++) {
			c[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(c);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].name);
		}
	}

	 class Student implements Comparable<Student> {
		String name; // 이름
		int korScore; // 국어점수
		int engScore; // 영어점수
		int mathScore; // 수학점수

		public Student(String name, int korScore, int engScore, int mathScore) {
			this.name = name;
			this.korScore = korScore;
			this.engScore = engScore;
			this.mathScore = mathScore;
		}

		@Override
		public int compareTo(Student o) {
			if (korScore > o.korScore)
				return -1;
			if (korScore < o.korScore)
				return 1;
			if (engScore < o.engScore)
				return -1;
			if (engScore > o.engScore)
				return 1;
			if (mathScore > o.mathScore)
				return -1;
			if (mathScore < o.mathScore)
				return 1;
			return name.compareTo(o.name);
		}
	}
	public static void main(String args[]) {
		new Sort10825().solve();
	}
}
