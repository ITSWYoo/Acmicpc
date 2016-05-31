package SortAlgo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.BrokenBarrierException;

//https://www.acmicpc.net/problem/10989
public class Sort10989 {
	
	private void mySort() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int arr[] = new int[10001];
		int n = Integer.valueOf(br.readLine());
		for(int i = 0 ; i<n; i++)
		{
			int tmp = Integer.valueOf(br.readLine());
			arr[tmp]++;
		}
		StringBuilder result = new StringBuilder();
		for(int i = 1; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				for(int j=0; j<arr[i]; j++)
				{
					result.append(i+"\n");
				}
			}
		}
		bw.write(result.toString());
		bw.flush();
	}
	public static void main(String args[]) throws IOException
	{
		new Sort10989().mySort();
	}
}

//Scanner 보다 BuffrerdReader 이용하는게 빠른가봄..