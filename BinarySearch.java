/*
 * Apply Only on sorted Array
 * TimeComplexity - O(logn)
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch {

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
		boolean res = binarySearchIt(a,num);
		System.out.println(res);
		res = binarySearchRec(a,num,0,a.length-1);
		System.out.println(res);
	}
	
// Recursive Approach
static boolean binarySearchRec(int[] a, int num, int low, int high)
{
		if(low>high)
			return false;
		if(low == high && a[low] == num)
			return true;
		int mid = (low+high)/2;
		if(num<a[mid])
			return binarySearchRec(a,num,low,mid-1);
		else if(num > a[mid])
			return binarySearchRec(a, num,mid+1, high);
		else 
			return true;
}
// Iterative Approach
	static boolean binarySearchIt(int[] a, int num) 
	{
		int low = 0,high = a.length-1;
		if(low==high&&a[low]==num)
			return true;
		while(low<=high)
		{
			int mid = (low+high)/2;
			if(num<a[mid])
				high = mid-1;
			else if(num>a[mid])
				low = mid+1;
			else
				return true;
		}
		return false;
	}
}
