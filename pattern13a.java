package Lec2;

import java.util.Scanner;

public class pattern13a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int row=1;
		while(row<=2*n-1)
		{
			//Star
			int i=1;
			while(i<=star)
			{
				System.out.print("* ");
				i++;
			}
			//Mirror
			if(row<n)
			{
			star++;
			}
			else
			{
				star--;
			}
			//next row prep
			System.out.println();
			row++;
			
			
		}
	}

}
