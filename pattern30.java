
import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int star=n;
        int row=1;
        while(row<=n)
        {
            //space
            int i=1;
            int val=5;
            while(i<=star)
            {
                System.out.print(val+" ");
                i++;
                val--;
            }
             System.out.println();
             row++;
        }
    }
}
