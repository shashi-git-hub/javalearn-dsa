import java.util.*;

public class array {
    public static void update(int marks[]){
        for(int i =0;i<marks.length;i++){
            marks[i] = marks[i]  + 1;
        }
    }
    public static int  linerSearch(int marks[],int key) {
        for(int i = 1; i<marks.length;i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        // int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // marks[3] = sc.nextInt();
        // System.out.println(marks[0] +  " " + marks[1]  +  " " + marks[2] +  " " + marks[3]);
        // int marks[] = {78,76,87,86,45,66};
        // update(marks);
        // for(int i =0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");

        // }
        // System.out.println( );
        int marks[] = {78,76,87,86,45,66};
        int key = 66;
        int index = linerSearch(marks, key);
        if(index == -1){
            System.out.println("not found");
        } else {
            System.out.println(" key ia a index"+ index);
        }
        

    }
}
