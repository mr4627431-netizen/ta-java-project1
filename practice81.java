import java.util.Scanner;

public class practice81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number :");
        int n=scanner.nextInt();
        int s=0;
        int p=1;
        while(n>0) {
            if (n % 10> 0) {
                s = s + ((n % 10) * p);
                p = p * 10;
            }
            n = n / 10;
        }
        System.out.println(s);

    }
}
