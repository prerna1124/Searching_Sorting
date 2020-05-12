//Runs in O(n) time

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] st = reader.readLine().trim().split("\\s+");
		int[] a = new int[st.length];
		for(int i=0;i<st.length;i++)
		{
			a[i] = Integer.parseInt(st[i]);
		}
		int num = Integer.parseInt(reader.readLine());
		boolean res = LinearSearchIt(a,num);
		System.out.println(res);
 }

	static boolean LinearSearchIt(int[] a, int num)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				return true;
		}
		return false;
	}
}
