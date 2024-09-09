import java.util.*;
public class odd_andd_even_in_delhi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Helppolice(arr);
    }
    public static void Helppolice(int [] arr) 
    {
        for (int j = 0; j < arr.length; j++)
         {
            int se=0;
            int so=0;
            int t=arr[j];
            while(t!=0)
            {
                int r=t%10;
                if(r%2==0)
                {
                    se+=r;
                }
                else{
                   so+=r;
                }
                t=t/10;
            }
            if(se%4==0 ||so%3==0)
            {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
    }
}
