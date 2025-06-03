import java.util.*;

public class function {

    public static void printHelloWorld() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");

    }

    public static int caculateSum(int a, int b) { // parameters or formal parameters

        int sum = a + b;
        return sum;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }

    public static int multiply(int a, int b) {
        int product = a * b;
        return product;

    }
    public static int factorial(int n){
        int f = 1;

        for(int i=1;i<= n;i++){
            f = f * i;
        }
        return f;

    }
    public static int bincoef(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoeff = fact_n/(fact_r*fact_nmr);
        return bincoeff;
    }
    // public static int sum(int a, int b){
    //     return a + b;
    // }
    // public static int sum (int a,int b,int c){
    //     return a+b+c; 
    //    }
       // functlion add 2 sum int num
       public static int sum (int a,int b){
        return a+b;
       }
       //functlion add 2 sum float num
       public static float sum (float a,float b){
        return a+b;
       }
    //    public static Boolean isPrime(int n){
    //     boolean isPrime = true;
    //     for(int i = 2; i<=n-1; i++){
    //         isPrime = false;
    //         break;
    //     }
    //     return isPrime;
    //    }
    // public static Boolean isPrime(int n){
    //     Boolean isprime = true;
    //     for(int i=2; i<=n-1; i++){
    //         if(n % i == 0){
    //             isprime = false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // }
    public static boolean isPrime(int n){
        if(n  == 2){
            return true;
        }
        for (int i = 2;i<=Math.sqrt(n);i++){
            if(n% i == 0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        for(int i= 2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println( );
    
    } 
    // binary to decimal

    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow ++;
            binNum = binNum/10;
            
        }
        System.out.println("decimal of"+ myNum   +" =" + decNum);
    }
    // decimal to binary
    public static void decToBinNum(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n>0) {
            int rem = n % 2;
            binNum = binNum +(rem * (int)Math.pow(10,pow));
            pow++;
            n= n/2;
            
        }
        System.out.println("binary from of"+ myNum +" = "+ binNum);
    }
    

    public static void main(String[] args) {
        // printHelloWorld();// function call
        //Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = caculateSum(a,b); // aruments or actual parameters
        // System.out.println("sum is : "+ sum);
        // int a = 5;
        // int b = 15;
        // swap(a, b);
        // System.out.println("a=" + a);
        // System.out.println("b=" + b);
        // int prodct = multiply(a, b);
        // System.out.println("a + b =" + prodct);
         
        // System.out.println(factorial(4)); 

        // System.out.println(bincoef(5, 2));
        System.out.println(sum(3,5));
        System.out.println(sum(1.5f,2.9f));
        //  isPrime(5);
        //  System.err.println(isPrime(10));
        System.out.println(isPrime(5));
        primeInRange(100);
        binToDec(1001);
        decToBinNum(9);

    }
}  
                                      