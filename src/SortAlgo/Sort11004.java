package SortAlgo;
//https://www.acmicpc.net/problem/11004

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Sort11004 {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
	
	private void mySort() throws NumberFormatException, IOException{
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		for(int i = 0 ; i<n; i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);

		StringBuilder builder = new StringBuilder();
		builder.append(arr[k-1]);
		wr.write(builder.toString());
		wr.flush();
	}
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		new Sort11004().mySort();
	}
}
