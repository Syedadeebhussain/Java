package Lec2;

public class pattern11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
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
				if(i%2==0)
				{
				System.out.print("  ");
				i++;
				}
				else
				{
					System.out.print("* ");
					i++;
				}
			}
			//next row preparation
			System.out.println();
			row++;
			space--;
			star+=2;
		}

	}

}
