import java.util.Scanner;

public class ManachersAlgo {

    
//  Manacher's Algorithm
// Longest Pelindrome String

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		
		String str = s.next();
		int lengthOflargestPelindromeString = 0;
		for(int i=0; i<str.length()-1; i++){
		    int count = 1;
		    
		    if(str.charAt(i) == str.charAt(i+1)){
		        count ++;
		    }
		    else{
		        for(int j = 1; j<str.length()-1; j++){
		        if(i-j>=0 && i+j<=str.length()-1){
		           if(str.charAt(i-j) == str.charAt(i+j)){
		             count += 2;
		           }
		        }     
		        else{
		            break;
		        }
		       
		        
		    }
		    }
		    
		    if(lengthOflargestPelindromeString < count){
		        lengthOflargestPelindromeString = count;
		    }
		    
		    
		}
		System.out.println(lengthOflargestPelindromeString);
	}
}


    

