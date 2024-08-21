package Lec2;

import java.util.Scanner;

public class pattern19a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int star=n-3;
			int space=-1;
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
				int j=1;
				while(j<=space)
				{
					System.out.print("  ");
					j++;
				}
				//star
				int i1=1;
				if(row==1 ||row==n)
				{
					i1=2;
				}
				while(i1<=star)
				{
					System.out.print("* ");
					i1++;
				}
				//mirror
				if(row<n/2+1)
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
