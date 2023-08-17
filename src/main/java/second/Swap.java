package second;

public class Swap {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        System.out.println("Before:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a += b;
        b = a - b;
        a -= b;

        System.out.println("After:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
