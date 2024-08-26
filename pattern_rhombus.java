import java.util.Scanner;

public class pattern_rhombus {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int row=1;
        int var=1;
        while(row<=2*n-1)
        {
            //space
            int j=1;
            while(j<=space)
            {
                System.out.print("  ");
                j++;

            }
            //star
            int i=1;
            int p=var;
            while(i<=star)
            {
                System.out.print(p+" ");
                if(i<=star/2)
                {
                    p++;
                }
                else
                {
                p--;
                }
                i++;
                

            }
            //mirror
            if(row<n)
            {
                space--;
                star+=2;
                var++;
            }
            else{
                space++;
                star-=2;
                var--;
            }
            //prep 
            System.out.println();
            row++;
          
           
           
        }
        }
    }
    