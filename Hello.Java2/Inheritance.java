
import java.util.Scanner;
import Bank;

// When one class want to take other class properties
// 4 -types

 //1. SINGLE LEVEL ()
 
//  class shape{
//     String color;
// }

// class Triangle extends shape{
    
//     }

// public class Inheritance{
//     public static void main(String[] args) {
      
//         Triangle t1 = new Triangle();
//         t1.color = "red";
//     }
// }





 //Multilevel inheritance

// class shape{
//     public void area(){
//         System.out.println("display area");
//     }
// }

// class Triangle extends shape{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }
// class EquilateralTriangle extends Triangle{
//     public void area(int l, int h){
//         System.out.println(1/2*l*h);
//     }
// }
// public class Inheritance{
//     public static void main(String[] args) {
      
        
//     }
// }




//3. Hierarchial Inheritance

class shape{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class Inheritance{
    public static void main(String[] args) {
      
        
    }
}


//Hybrid Inhweritance


