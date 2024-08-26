import java.util.*;
public class pattern_hour_glass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=2*n+1;
        int row=1;
        int space=0;
        int val=n;
        while(row<=2*n+1)
        {
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;

            }
            int i=1;
            int p=val;
            while(i<=star)
            {
                System.out.print(p+" ");
                if(i<=star/2)
                {
                    p--;
                }
                else{
                    p++;
                }
                i++;
            }

            if(row<n+1)
            {
                space++;
                star-=2;
                val--;
            }
            else
            {
                space--;
            star+=2;
            val++;
            }
            System.out.println();
            row++;
            
        }
        }
    }