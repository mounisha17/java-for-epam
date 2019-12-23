import java.util.*;
import java.lang.Math;
public class Calculator
{
	public static void main(String[] args) {
		int n1,n2;
		double d1,d2;
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
	    d1=sc.nextDouble();
	    d2=sc.nextDouble();
	    int cal1=cal(n1,n2);
	    double cal2=calci(d1,d2);
	    System.out.println("Int calci: "+cal1);
	    System.out.println("Double calci: "+cal2);
		
	}
		public static int cal(int n1,int n2)
		{
		    int c1=(int)Math.pow(n1,n2);
		    return c1;
		
 	}
 	public static double calci(double d1,double d2)
 	{
 	    double c2=Math.pow(d1,d2);
 	    return c2;
 	}
}
