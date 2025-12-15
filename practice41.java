public class practice41 {
    public static void main(String[] args) {
    int a=0;
    int b=1;
    int c=0;
    int x=0;
    while(x<50){
        c=a+b;
        a=b;
        b=c;
        x=x+1;
        System.out.println(c);
    }
}
}
