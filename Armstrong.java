import java.util.*;
public class Armstrong
{
public static void main(String args[]) 
    {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Armstrong(n);
    }
    public static int count(int num)
    {
		int c=0;
		while(num!=0)
		{
			int r=num%10;
			c++;
			num=num/10;
		}
        return c;
    }
	public static void Armstrong(int a)
	{
        int c=count(a);
		int sum=0;
        int n=a;
		while(n!=0)
		{
			int r1=n%10;
			sum+=Math.pow(r1,c);
			n=n/10;
		}
		if(sum==a)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}