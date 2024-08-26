// Take N (number of rows), print the following pattern (for N = 4).

//                        1 
//                      2 3 2
//                    3 4 5 4 3
//                  4 5 6 7 6 5 4


import java.util.Scanner;

public class pattern_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=n-1;
        int row=1;
        while(row<=n)
        {
            int i1=1;
            while(i1<=space)
            {
                System.out.print("\t");
                i1++;
            }
            int i=1;
            int var=row;
            while(i<=star)
            {
                System.out.print(var+"\t");
                if(i<=star/2)
                {
                var++;
                }
                else{
                    var--;
                }
                i++;
            }
            
            System.out.println();
            row++;
            star+=2;
            space--;
           
        }
        }
    }


    