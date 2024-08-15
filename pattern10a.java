package Lec2;

import java.util.Scanner;

public class pattern10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=2*n-1;
		int space=0;
		int row=1;
		while(row<=n)
		{
			//space
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
			//star
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			star-=2;
			space+=1;
	}

}}