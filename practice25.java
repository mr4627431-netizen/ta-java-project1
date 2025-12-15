import java.util.Scanner;

public class practice25 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.print("enter number :");
            int n=scanner.nextInt();
            int s=1;
            for (int x =1; x<=n ;x++){
                s=s*x;
            }
            System.out.println(s);

        }
    }

