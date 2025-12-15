import java.util.Scanner;

public class practice67 {
    public static void main(String[] args) {
        int c = 0;

        for(int i = 0; i < 100; ++i) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number:");
            int s = 0;
            int x = scanner.nextInt();

            int x1;
            for(x1 = x; x > 0; x /= 10) {
                s = s * 10 + x % 10;
            }

            if (s == x1) {
                ++c;
            }
        }

        System.out.println(c);
    }
}
