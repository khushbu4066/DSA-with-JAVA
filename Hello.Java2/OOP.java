class pen{
    String color;
    String type; // ballpoint gel

    public void write(){
        System.out.println("writing something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}



class student{
      String name;
      int age;

      public void printIn(){
        System.out.println(this.name);
        System.out.println(this.age);
      }

}

public class OOP{
    public static void main(String[] args){
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        student s1 = new student();
        s1.name = "khushi";
        s1.age = 14;



        pen1. write();
        pen1.printcolor();
        pen2. printcolor();
        s1.printIn();




    }
}