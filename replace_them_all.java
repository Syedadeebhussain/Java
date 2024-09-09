
import java.util.Scanner;


// import java.util.Scanner;

// public class replace_them_all {
//  public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     long n=sc.nextLong();
//     replace(n);
//  }   
//  public static void replace(long  n) {
//     long sum=0;
//     int i=0;
//      while(n!=0)
//      {
//         long r=n%10;
//         if(r==0)
//         {
//             sum+=5*Math.pow(10,i);
//         }
//         else{
//             sum+=r*Math.pow(10,i);
//         }
//         i++;
//         n=n/10;
//      }
//      System.out.println(sum);
//  }
// }
public class replace_them_all {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String n=sc.next();
       System.out.println(n.replace("0","5")); 
    }
}