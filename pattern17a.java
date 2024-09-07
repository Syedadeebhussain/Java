
import java.util.Scanner;

public class pattern17a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=n/2;
        int space=1;
        while(row<=n)
        {
            int i=1;
            while(i<=star)
            {
                System.out.print("* ");
                i++;
            }
            int i1=1;
            while(i1<=space)
            {
                System.out.print("  ");
                i1++;
            }
            int i2=1;
            while(i2<=star)
            {
                System.out.print("* ");
                i2++;
            }
            //mirror
            if(row<=n/2)
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
