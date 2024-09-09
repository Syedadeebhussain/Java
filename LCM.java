import java.util.*;
public class LCM {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
System.out.println(lcm(n1,n2));
    }
    public static int lcm(int n1,int n2) 
    {             
int i=2;
int min=2;
while(i!=1)
{
    if(i%n1==0 && i%n2==0)
    {
       return i;
       break;
    }
    i++;
}
    }
}