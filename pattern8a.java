
import java.util.Scanner;

public class pattern8a {
    public static void main(String[] args) 
    {
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
            if(row==1 ||row==n ||i==1 ||i==star)
            {
            System.out.print("* ");
            }
            else
            {
            System.out.print("  ");
            }
            i++;
        }
        //next row preparation
        System.out.println();
        row++;
    }

}

}

