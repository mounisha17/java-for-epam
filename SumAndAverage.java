import java.util.*;
public class SumAndAverage
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int sum=0;
		int[] a=new int[l];
		for(int i=0;i<l;i++)
		{
		    a[i]=sc.nextInt();
		
		    sum=sum+a[i];
		}
		int ave=sum/l;
		System.out.println(ave);
 	}
}
