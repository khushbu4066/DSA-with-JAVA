import java.util.*;

public class LAB1 { 
    static String username="Sam";
    static int Password=1234; 
    static int pin=6666; 
    static int balance=1000;
public static void main(String[] args) {

// TO DO Auto-generated method 

Scanner sc = new Scanner(System.in); 
String user;
int pass;

System.out.println("Enter your username :- "); 
user=sc.nextLine();
System.out.println("Enter your password :- ");
// chance of overflow and system crashes 
pass=sc.nextInt();


//checks for user name
if(user.compareTo(username)!=0) { 
    System.out.println("Wrong username!!!");
    System.exit(0);

}

// checks for correct pin
if(pass!=Password) {
System.out.println("Wrong password!!!");
}
// even if password is incorrect but user name is correct it logs in.

System.out.println("welcome "+user); 
System.out.println("\n Available balance is :- "+balance);
System.out.println("Enter amount to be withdrawn:- "); 
int amount=sc.nextInt();

System.out.println("Enter your 4 digit pin :-  ");
int pincode=sc.nextInt();

if(pincode==pin) {
    balance-=amount;
    }
    
     
    //checks balance after deducting and balance may go to negative and
    // it can also trigger false positive if leftover balance after deductionis less than amount
    if(balance<amount) {
    System.out.println("Insufficient money in your acount"); 
    System.out.println("No money can be taken out. please contact bank");
    }
    
    System.out.println("Your available balance is :- "+balance);
    System.out.println("\n Thank you for banking with us :) ");
    }    
}
    

    

