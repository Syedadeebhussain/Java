import java.util.*;
public class hollow_rhombus {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              int star=n;
              int space=n-1;
              int row=1;
              while(row<=n)
              {
                  int j=1;
                  while(j<=space)
                  {
                      System.out.print("  ");
                      j++;
      
                  }
                  int i=1;
                  while(i<=star)
                  {
                      if(row==1 ||row==n ||i==1 ||i==n)
                      {
                      System.out.print("*");
                      i++;
                      }
                      else{
                          System.out.print(" ");
                          i++; 
                      }
      
                  }
                  System.out.println();
                  row++;
                  space--;
                 
                 
              }
              }
          }