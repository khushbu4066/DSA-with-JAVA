

    //Constructors in java (For making objects in java one type of methods/ functionds )

// three properties of constructors
/*
 1. Same name as class
 2. no return type
3.  only one constructor for one object
 */

    //Non - Parametrized cpnstructor - No parameters


    
    

    // class student{
    //       String name;
    //       int age;
    
    //       public void printIn(){
    //         System.out.println(this.name);
    //         System.out.println(this.age);
    //       }
    
    //       student(){
    //         System.out.println("condtructor called");
    //       }
    // }

    
    // public class Constructor{
    //     public static void main(String[] args){
            
    //         student s1 = new student();
    //         s1.name = "khushi";
    //         s1.age = 14;
    
    
    //         s1.printIn();
    
    
    
    
    //     }
    // }






    //Parameterized Constructor - Have parameters inside it

//     class student{
//         String name;
//         int age;
  
//         public void printIn(){
//           System.out.println(this.name);
//           System.out.println(this.age);
//         }
  
//         student(String name, int age){
//           this.name = name;    //parameterized constructor
//           this.age = age;
//         }
//   }

  
//   public class Constructor{
//       public static void main(String[] args){
          
//           student s1 = new student("aman", 15);
  
//           s1.printIn();
  
//       }
//   }



//Copy constructors -  copying one object and tranfer imto another object

class student{
    String name;
    int age;

    public void printIn(){
      System.out.println(this.name);
      System.out.println(this.age);
    }

    student(student s2){
      this.name = s2.name;   //copy constructor
      this.age = s2.age;
    }
    student(){

    }
}


public class Constructor{
  public static void main(String[] args){
      
      student s1 = new student();
      s1.name = "khushi";
      s1.age = 24;

      student s2 = new student(s1);

      s2.printIn();

  }
}


// In java we don't have Destructors, because in java having Garbage collector who atomatically deletes constructors

