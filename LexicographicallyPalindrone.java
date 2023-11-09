import java.util.Scanner;

public class LexicographicallyPalindrone {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String st = sc.next();
		
		int mid = st.length()/2;
		String frontStr = st.substring(0,mid);
		String oddStr = st.substring(mid, mid+1);
		String rearStr = st.substring(mid+1);
		
		for(int i=0; i<3; i++){
		    int [] char = new char(frontStr);
		}
		String string = new String(a);
		
		System.out.println(frontStr.sort());
		System.out.println(oddStr);
		System.out.println(rearStr);
	}
    
}
