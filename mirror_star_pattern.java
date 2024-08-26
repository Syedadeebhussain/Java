// Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

//       *
//    *  *  *  
// *  *  *  *  *  
//    *  *  *
//       *


import java.util.Scanner;

public class mirror_star_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n/2;
        int row=1;
        while(row<=n)
        {
            int i1=1;
            while(i1<=space)
            {
                System.out.print("  ");
                i1++;
            }
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            //mirror
            if(row<n/2+1)
            {
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
            System.out.println();
            row++;
           
           
        }
        }
    }
 