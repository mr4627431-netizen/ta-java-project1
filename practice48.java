import java.util.Scanner;

public class practice48 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.println("enter number :");
    int n = scanner.nextInt();
    int s=1;
    while(n>0){
        s=s*(n%10);
        n=n/10;
    }
    System.out.println(s);

}
}
