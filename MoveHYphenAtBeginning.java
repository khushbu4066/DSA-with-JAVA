//  move hyphen to beginning

import java.util.Scanner;

public class MoveHYphenAtBeginning {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String newString = "";
		String hyphen = "";
		for(int i=0; i<st.length(); i++){
		    if(st.charAt(i) == ' '){
		        hyphen +=" ";
		    }
		    else{
		        newString +=st.charAt(i);
		    }
		}
		System.out.println(hyphen+newString);
		
		
	}
}