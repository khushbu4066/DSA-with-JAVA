import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array");
        for (int k = 0; k< n; k++) 
        arr[k] = sc.nextInt();
		
		// int arr[] = {10, 2, 2, 2,6,7,2,2,6};
		int majorityElement = arr[0];
		int maxCount =0;
		for(int i =0; i<arr.length; i++){
		    int count =0;
		    
		    for(int j =i; j<arr.length; j++){
		        if(arr[i] == arr[j]){
		            count++;
		        }
		        
		    }
		    if(count>maxCount){
		        maxCount = count;
		        majorityElement = arr[i];
		    }
		}
		
		if(maxCount > arr.length/2){
		    System.out.println("The majority element is :"+ majorityElement);
		}
		else{
		    System.out.println("There is no majority Element");
		}
	}
}

    

