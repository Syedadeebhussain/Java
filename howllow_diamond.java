// Take N (number of rows), print the following pattern (for N = 5).

//      * * * * *
//      * *   * *
//      *       *
//      * *   * *
//      * * * * *



import java.util.Scanner;

public class howllow_diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=n/2+1;
        int space=-1;
        int row=1;
        while(row<=n)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print("*\t");
                i++;
            }
            int i1=1;
            while(i1<=space)
            {
                System.out.print("\t");
                i1++;
            }
            int i2=1;
            if(row==1||row==n )
            {
                i2=2;
            }
            while(i2<=star)
            {
                System.out.print("*\t");
                i2++;
            }
            //mirror
            if(row<n/2+1)
            {
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
            row++;
           
        }
        }
    }

