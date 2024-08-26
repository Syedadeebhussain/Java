import java.util.Scanner;
// Very Important question
public class inverted_hour_glass {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int star=1;
            int space=(2*n+1)-1;
            int row=1;
            int var1=n;
            while(row<=2*n+1)
            {
                //star
                int i=1;
                int var=n;
                while(i<=star)
                {
                    System.out.print(var+" ");
                    i++;
                    var--;
                }
                //space
                  int j=2;
                while(j<=space)
                {
                    System.out.print("  ");
                    j++;
                }
                //star
                  int k=1;
                  int p=var1;
                  if(row==n+1)
                  {
                      k=2;
                      p=1;
                  }
                while(k<=star)
                {
                    System.out.print(p+" ");
                    k++;
                    p++;
                    
                }
                //mirror
                if(row<n+1)
                {
                  star++;
                space-=2;
                var1--;
                }
                else
                {
                star--;
                space+=2;
                var1++;
                }
                System.out.println();
                row++;
              
            }
                }
            }