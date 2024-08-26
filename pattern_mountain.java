import java.util.Scanner;

public class pattern_mountain {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=2*n-3;
        int row=1;
        while(row<=n)
        {
            int j=1;
            while(j<=star)
            {
                System.out.print(j+" ");
                j++;

            }
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j1=1;
            int val=row;
            
            if(row==n)
            {
                j1=2;
                val=n-1;
            }
            while(j1<=star)
            {
                System.out.print(val+" ");
                val--;
                j1++;
            }
            System.out.println();
            row++;
            space-=2;
            star++;
            val++;
        }
        }
    }