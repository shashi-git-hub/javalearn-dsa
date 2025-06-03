// public class oops {
//     public static void main(String[] args)  {
        // Pen p1 = new Pen();

        // p1.setColor("blue");
        // // System.out.println(p1.color);
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("yello");
        // System.out.println(p1.getColor());

        // BankAccount myAcc = new BankeAccount();
        // myAcc.username = "shashi";
        // myAcc.setPassword("fguysf")
        // Student s1 = new Student("shahsi");
        // System.out.println(s1.name);
        // Student s2 = new Student();
        // Student s3 = new Student(354);
        // Student s4 = new Student("shashi",345);
//         s1.name = "shekhar";
//         s1.roll = 343;
//         s1.password = "abcd";
//         s1.marks[0] = 100;
//         s1.marks[1] =  120;
//         s1.marks[2] = 123;
//         Student s2 = new Student(s1);
//         s2.password = "gtb";
//         s1.marks[2]= 53;
//         for(int i= 0;i<3; i++){
//             System.out.println(s2.marks[i]);
//         }
//     }
    
// } 

// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }

// }
// class Pen {
//      private String color;
//      private int tip;
//     String getColor(){
//         return this.color;

//     }
//     int getTip() {
//         return this.tip;
//     }

//     void setColor(String newColor) {
//         this.color = newColor;

//         }
//         void setTip(int newTip) {
//             this.tip = newTip;

//         }
// }
// 
// class Student{
//     String name;
//     int roll;
//     String password;
//     int marks[];
    // Student(){

    // }
    //shallow copy
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks= s1.marks;

        
    // }
    // deep constructor 
//     Student(Student s1){
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i=0;i<marks.length;i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }

//     Student(){
//         // this.name = name;
//         marks = new int[3];
//         System.out.println("cpnstructor is called");
//     }
//     Student(String name){
//         marks = new int[3];
//         this.name = name;

//     }
//     Student(int roll){
//         marks = new int[3];
//         this.roll = roll; 
//     }
// }

// inheritance 
// public class oops {
//     public static void main(String[] args)  {
        // Fish shark = new Fish();
        // shark.eats();
        // Dog dobby = new Dog();
        // dobby.eats();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
//         Bird parrot = new Bird();
//         parrot.breathe();
        

//     }
// }

// // base class 
// class Animal{
//     String color;

//     void eats(){
//         System.out.println("eats"); 
//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// class Mammal extends Animal {
//     void walk(){
//         System.out.println("walk");
//     }
// }
// class Fish extends Animal {
//     void swim(){
//         System.out.println("swim");
//     }
// }
// class Bird extends Animal {
//     void fly(){
//         System.out.println("fly");
//     }
// }
// class Mammal extends Animal {
//     int legs;
// }
// class Dog extends Mammal {
//     String breed;
// }
// derived class
// class Fish extends Animal {
//     int fins;
//     void swin(){
//         System.out.println("swims in water");
//     }
// } 
//polymorhism
  
public class oops {
    public static void main(String[] args)  {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 7));
        // System.out.println(calc.sum(1.25f, 7.25f));

        // System.out.println(calc.sum(1, 7 ,9));
        Deer d = new Deer();
        d.eat();


    }
}

class Animal{
    void eat(){
        System.out.println("eate anythig");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println(" eat only grass");
    }
}
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a + b;
    } 

    int sum(int a, int b, int c){
        return a + b + c ;

    }
}