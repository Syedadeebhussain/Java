package Lec2;

import java.util.Scanner;

public class pattern22a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int row=1;
		int space=-1;
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
			int k=1;
			if(row==1)
			{
				k=2;
			}
			while(k<=star)
			{
				System.out.print("* ");
				k++;
				
			}
			//next row prep
			System.out.println();
			row++;
			star--;
			space+=2;
			
		   }
	}

}
