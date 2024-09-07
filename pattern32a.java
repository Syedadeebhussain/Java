
import java.util.Scanner;

public class pattern32a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
  int row=1;
  int star=1;
  int val=1;
  while(row<=2*n-1)
  {
	  int j=1;
	  int p=val;
	  while(j<=star)
	  {
		if(j%2==0)
		{
		  System.out.print("* ");
		}
		else{
			System.out.print(p+" ");
		}
		  j++;
	  }
	  //mirror
	  if(row<n)
	  {
		star+=2;
		val++;

	  }
	  else{
		star-=2;
		val--;
	  }
	  System.out.println();
	  row++;
  }
	}
}