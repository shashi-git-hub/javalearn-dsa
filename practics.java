import java.util.*;

public class practics {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a =" + a);
        System.out.println("value of b =" + b);
    }

    public static void main(String[] args) {
        // System.out.print("shahsi");
        // }
        // int r = 5;
        // float pie = 3.14f;
        // float are = pie *(r*r);
        // System.out.println(are);
        System.out.println(factorial(5));
        int a = 10;
        int b = 20;
        swap(a, b);

    }
}
