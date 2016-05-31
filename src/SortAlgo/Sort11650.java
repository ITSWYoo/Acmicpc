package SortAlgo;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/11650
public class Sort11650 {
	private Scanner sc =new Scanner(System.in);
	private class Point implements Comparable<Point>{
		private int x;
		private int y;
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Point o) {
			if(getX()>o.getX())return 1;
			if(getX()<o.getX())return -1;
			if(getY()>o.getY())return 1;
			if(getY()<o.getY())return -1;
			return 0;
		}
	}
	private void mySort()
	{
		int n = sc.nextInt();
		Point[] p = new Point[n];
		for(int i =0 ; i<n; i++)
		{
			p[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(p);
		for(int i =0 ; i<p.length; i++)
		{
			System.out.println(p[i].x+" "+p[i].y);
		}
	}
	public static void main(String args[])
	{
		new Sort11650().mySort();
	}
}
