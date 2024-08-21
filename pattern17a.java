package Lec2;

import java.util.Scanner;

public class pattern17a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n/2;
		int space=1;
		int row=1;
		while(row<=n)
		{
			//star
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			//space
			int i1=1;
			while(i1<=space)
			{
				System.out.print("  ");
				i1++;
			}
			//star
			int i2=1;
			while(i2<=star)
			{
				System.out.print("* ");
				i2++;
			}
			//mirror
			if(row<=n/2)
			{
				star--;
				space+=2;
			}
			else
			{
				star++;
				space-=2;
			}
			System.out.println();
			row++;
			
		}
	}

}
