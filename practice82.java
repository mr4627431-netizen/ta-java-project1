import java.util.Scanner;

public class practice82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("enter number :");
          int n = scanner.nextInt();
          int s=0;
          int p=1;
          while(n>0) {
              s = s  + (n % 2)*p;
              n = n / 2;
              p = p*10;
          }
           System.out.println(s);
    }
}
