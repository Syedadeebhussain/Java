import java.util.Scanner;

public class pattern_Magic {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n;
        int space=-1;
        int row=1;
        while(row<=2*n-1)
        {
            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;

            }
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j1=1;
            if(row==1 ||row==2*n-1)
            {
                j1=2;
            }
            while(j1<=star)
            {
                System.out.print("* ");
                j1++;

            }
            if(row<n)
            {
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            System.out.println();
            row++;
           
           
           
        }
        }
    }

