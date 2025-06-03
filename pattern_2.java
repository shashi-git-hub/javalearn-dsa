
public class pattern_2 {
    public static void hellowRectangle(int toRow, int toCols) {
        for (int i = 1; i <= toRow; i++) {
            for (int j = 1; j <= toCols; j++) {
                if (i == 1 || i == toRow || j == 1 || j == toCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_withNumber(int n) {
        for (int i = 1; i <= n; i++) {
            // inner loops
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_trangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            // stars -1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-1)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd haf 
        for (int i = n; i >= 1; i--) {
            // stars -1
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces - 2*(n-1)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // diamond pattern
    public static  void diamond(int n){
        // 1st half
        for(int i=1;i<=n; i++){
            //spaces
            for(int j=1;j<=(n-i); j++) {
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

        // 2half op
        for(int i=n;i>=1; i--){//spaces      
            for(int j=1;j<=(n-i); j++) {
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    // number pyramid
    public static void numberPyramid(int n) {
        // outer loops
        for(int i=1;i<=n;i++){
            // spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // number
            for(int j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println( );

        }
        
    }
  //  palindromic pattern 
  public static void palindromic(int n){
    //outer loop
  for(int i=1;i<=n;i++){
    // spaces
    for(int j= 1; j<=n-i;j++){
        System.out.print(" ");
    }
    // descending
    for(int j=i; j>=1;j--){
        System.out.print(j);
    }
    //ascending
    for(int j=2;j<=i;j++){
        System.out.print(j);
    }
    System.out.println( );

  }
}

    public static void main(String[] args) {
        // hellowRectangle(5, 5);
        // inverted_half_pyramid_withNumber(6);
        // floyds_triangle(6);
        // zero_one_trangle(4);
        // butterfly(5);
        // diamond(5);
        // numberPyramid(6);
        palindromic(5);

    }

}
