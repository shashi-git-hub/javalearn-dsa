// import java.util.*;

// public class condation {
//     public static void main(String[] args) {    
//         // int age = 14;
//         // if(age>18){
//         //     System.out.println("adult: drive,vote");
//         // }
//         // if(age>13 && age <18){
//         //     System.out.println("teenager");
//         // }
//         // else{
//         //     System.out.println("not adult");
//         // }
//         Scanner sc = new Scanner(System.in);
//         // int salary = sc.nextInt();
//         // int tax;

//         // if(salary < 500000){
//         //     tax = 0;
//         // } else if(salary >= 500000 && salary >1000000) {
//         //     tax = (int)(salary * 0.2);

//         // }
//         // else{
//         //     tax = (int) (salary*0.3);
//         // }
//         // System.out.println("yur tax is"+ tax);

//         // print the largest number of three

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if((a>= b) && (a>=c) ){
//             System.out.println( "a is grater" );
//         } else if ( b >= c){
//             System.out.println( "b is grater" );

//         } else{
//             System.out.println( "c is grater" );

//         }

//     }
// }

// ternary operators
// import java.util.*;

// public class condation {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // int num = 7;
//         // String type = ((num %2) == 0)? " evan" : "odd";
//         // System.out.println(type);

//         //
//         // switch statement
//         int number = 0;

//         switch (number) {
//             case 2:
//                 System.out.println("samosa");
//                 break;
//             case 3:
//                 System.out.println("shake");
//                 break;

//             case 1:
//                 System.out.println("burger");
//                 break;

//             default:
//                 System.out.println("chal be");

//         }
//     }
// }

// calcuator using swith statement 

// import java.util.*;

// public class condation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter value a");
//         int a = sc.nextInt();
//         System.out.println(" enter value b");
//         int b = sc.nextInt();
//         System.out.println(" enter opertor");

//         char oprator = sc.next().charAt(0);

//         switch (oprator) {
//             case '+':
//                 System.out.println(a + b);

//                 break;
//             case '-':
//                 System.out.println(a - b);

//                 break;
//             case '*':
//                 System.out.println(a * b);

//                 break;
//             case '%':
//                 System.out.println(a % b);

//                 break;
//             case '/':
//                 System.out.println(a / b);

//                 break;

//             default:
//                 System.out.println("wrong condition ");
//         }

//     }

//}
// prectice question 

import java.util.*;

public class condation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write a java pyrogram to get a number from use and print pastive and negative 
        System.out.println("enter a numer");
        int num1 = sc.nextInt();
        
        if(num1>=0){
            System.out.println("postive  number");
        }
        else {
            System.out.println("negative  number");


        }
 }
}