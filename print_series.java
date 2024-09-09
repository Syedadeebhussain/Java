public class print_series {
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();;
    Series(n1,n2);
        }
        public static void Series(int n1,int n2)
        {
            int i=1;
            while(n1!=0)
            {
               int c=3*i+2;
               if(c%n2!=0)
               {
                   System.out.println(c);
                   n1--;
               } 
               i++;
            } 
        }
    }