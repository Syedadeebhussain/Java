import java.util.Scanner;

public class pattern_double_sided_arrow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int row=1;
        int val=1;
while(row<=n)
{
    int i=1;
    while(i<=space)
    {
        System.err.print("  ");
        i++;
    }
    int i1=1;
    int p=val;
    while(i1<=star)
    {
        if(p>0)
        {
        System.out.print(p+" ");
        }
        
        else{
            System.out.print("  ");
        }
        if(i1<=star/2)
        {
           p--;
        }
        else
        {
            p++;
        }
        i1++;
    }
       
    //mirror
    if(row<n/2+1)
    {
        star+=4;
        space-=2;
        val++;
    }
    else{
        star-=4;
        space+=2;
        val--;
    }
    System.out.println();
    row++;
  
}
    }
}
