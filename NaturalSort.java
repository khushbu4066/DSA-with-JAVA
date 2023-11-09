import java.util.Scanner;

public class NaturalSort{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		int n = Math.min(str1.length(), str2.length());
		int m = Math.max(str1.length(), str2.length());
		int count =0; 
		
		for(int i =0; i<n; i++){
		    if(str1.charAt(i) == str2.charAt(i)){
		       count++; 
		       continue;
		    }
		    else{
		        char ch1 = str1.charAt(i);
		        char ch2 = str2.charAt(i);
		        if((int)ch1 > (int)ch2){
		            System.out.println(str2);
		            break;
		        }
		        else{
		            System.out.println(str1);
		            break;
		        }
		    }
		}
		
		if(count == n){
		    if(str1.length()>str2.length()){
		        System.out.println(str2);
		    }
		    else{
		        System.out.println(str1);
		    }
		}
	}
}
