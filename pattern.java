public class pattern {
    public static void main(String[] args) {
        // for (int line = 1; line <= 5; line++) {
        //     for (int star = 1; star <=line; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for(int line=1; line<=n;line++){
        //     for(int star=1;star<=n-line+1;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // int n = 9;
        // for(int line = 1; line<=n;line++){
        //     for(int number = 1; number<= line; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }

        int n = 4;
        char ch ='A';
        // outer loops 
        for(int i =1;i<= n;i++){
            //inner loops
            for(int j =1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

}
