import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int h,l,b;
		Scanner sc= new Scanner(System.in);
		h=sc.nextInt();
		l=sc.nextInt();
		b=sc.nextInt();
		int v=volume(l,b,h);
		System.out.println("Volume is: "+v);
	}
		public static int volume(int l,int b,int h)
		{
		    int v=l*b*h;
		    return v;
		
 	}
}
