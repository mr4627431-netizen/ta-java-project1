import java.util.Scanner;

public class pactice59 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter number :");
        int n=scanner.nextInt();
        int p=2;
        while(n>1) {
            int k = 0;
            while(n % p == 0) {
                n = n / p;
                k =k+1;
            }
            if (k > 0)
                System.out.println(p + "**" + k + "*");

            p=p+1;
        }

    }
}
