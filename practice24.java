import java.util.Scanner;

public class practice24 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int c=0;
        for(int x=0;x<=n;x++) {
            if (x % 2 == 0) {
                c = c + 1;
            }
        }
        if(c==2) {
            System.out.println("yes");
        } else
            System.out.println("no");




    }
}
