package Lec2;

import java.util.Scanner;

public class pattern14a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int row=1;
		int space=n-1;
		while(row<=2*n-1)
		{
			//space
			int j=1;
			while(j<=space)
			{
				System.out.print("  ");
				j++;
			}
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
			space--;
			}
			else
			{
				star--;
				space++;
				
			}
			//next row prep
			System.out.println();
			row++;
			
			
		}
	}

}
