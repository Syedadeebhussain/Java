package Lec2;

import java.util.Scanner;

public class pattern1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		int star=n;
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
			//next row preparation
			System.out.println();
			row++;
		}

	}

}
