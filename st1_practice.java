import java.util.Scanner;

// public class st1_practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int avrag = (a+b+c)/3;
//         System.out.println(avrag);

//     }

// }
//

// second question

// public class st1_practice{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         Float side = sc.nextFloat();
//         float area = side * side;
//         System.out.println(area);
//     }
// }
//third question
public class st1_practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pencil = sc.nextInt();
        int pen = sc.nextInt();
        int eraser = sc.nextInt();
        int total_price = pencil + pen + eraser;
        System.out.println(total_price);
        float newtotal = total_price + (0.18f * total_price);
        System.out.println(newtotal);

    }
}