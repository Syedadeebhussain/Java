package Lec2;

import java.util.Scanner;

public class pattern15a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=0;
		int row=1;
		while(row<=2*n-1)
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
			//mirror
			if(row<n)
			{
				star--;
				space+=2;
			}
			else
			{
				star++;
				space-=2;
			}
			
			
			
			//pep for nextline
			System.out.println();
			row++;
			
			
		}
	}

}
