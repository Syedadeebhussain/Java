package Lec2;

import java.util.Scanner;

public class pattern4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int row=1;
		int space=n-1;
		while(row<=n)
		{
			//space
			int i1=1;
			while(i1<=space)
			{
				System.out.print("  ");
				i1++;
			}
			//star
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			//next row preparation
			System.out.println();
			row++;
			star++;
			space--;
		}
	}

}
