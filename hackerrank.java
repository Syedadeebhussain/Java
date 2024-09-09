
import java.util.Scanner;

class hackerrank{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=2*n-1;
        int space=0;
        int j=n;
        int val=n+1;
        while(row<=2*n-1)
        {
            int i=1;
            int j1=n;
            while(i<=space)
            {
                System.out.print(j1+" ");
                i++;
                j1--;

            }
           int i1=1;
            while(i1<=star)
            {
                System.out.print(j+" ");
                i1++;
            }
            int i2=1;
           int p=val;
            while(i2<=space)
            {
                System.out.print(p+" ");
                i2++;
               p++;      
            }
            

            if(row<n)
            {
           
            star-=2;
            space++;
            j--;
            val--;
            }
            else
            {
            star+=2;
            space--;
            j++;
            val++;
            }
            System.out.println();
            row++;
         
           
        }
    }
}