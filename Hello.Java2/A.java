public class A {
    
    //Static variable intialization
    static int b = 10;

    //Instant variable intialization
    int c = 30; 

    public static void main(String args[]){

        int a = 10;  // Local variable
        A ref = new A();
        System.out.println(a);
        System.out.println(A, b);
        System.out.println(ref, c);
    }
}
