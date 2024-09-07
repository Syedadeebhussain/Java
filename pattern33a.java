
import java.util.Scanner;

public class pattern33a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        int star=1;
        int row=10;
        while(row>0)
        {
            //space
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
             //star
             int i1=1;
             int val=row;
             while(i1<=star)
             {
                if(i1==star/2+1)
                {
                 System.out.print("0 ");
                }
                else{
                    System.out.print(val+" ");
                }
                 if(i1<=star/2)
                 {
                    val++;
                 }
                 else{
                    val--;
                 }
                 i1++;
             }
             System.out.println();
             row--;
             star+=2;
             space--;
        }
    }
}
