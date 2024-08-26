import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int row=1,a=0;
        while(row<=n)
        {
            int i=1;
            int var=1;
            if(row==n+1)
            {
              a=0;
            }
            while(i<=star)
            {
                System.out.print(var);
                i++;
                var+=a;
                }
            System.out.println();
            row++;
            star++;
        }
           
        }
        }
    