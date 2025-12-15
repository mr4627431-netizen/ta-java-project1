public class practice40 {
    public static void main(String[] args) {
    int k = 0;
    int x = 1;
    while (k < 50) {
        int c = 0;
        for (int y = 1; y <= x; y++) {
            if (x % y == 0)
                c=c+1;
        }
        if (c == 2)
            k = k + 1;
        x = x + 1;

    }
    System.out.println(x - 1);

}
}
