
// Poly - many
// Mmorphism - forms
// doing one work using different types is called polymorphism in java
// 2- types 
// Compile time and run time polymorphism
// here we are discusssing only discussing compile time polymorphism and runtime we will discuss in Inheritance topic because they are using there


// Compile Time Polymorphism or function overloading

class student{
    String name;
    int age;

   public void printInf(String name)
{
    System.out.println(name);
}
public void printInf(int age){
    System.out.println(age);
}
public void printInf(String name, int age){
    System.out.println(name + " " + age);
}
}


public class Polymorfism{
  public static void main(String[] args){
      
      student s1 = new student();
      s1.name = "khushi";
      s1.age = 24;

      s1.printInf(s1.name, s1.age);

}







    
}
