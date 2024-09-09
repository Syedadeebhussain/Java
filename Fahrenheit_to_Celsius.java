import java.util.*;
public class Fahrenheit_to_Celsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int step=sc.nextInt();
        int celsius=0;
        for (int i = m; i <=n; i=i+step) {
            celsius=(int)(((double)5/(double)9)*(i-32));
             System.out.println(i+" "+celsius);
        }
    }
}

