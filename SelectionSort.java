public class SelectionSort {

    // Selection Sort
	public static void main(String[] args) {
	    
	    int arr []= {2, 10,8, 9,3,1};
	    
		for(int i=0; i<arr.length-1; i++){
            int min = arr[i];
            for(int j =i+1; j<arr.length; j++){
                
                if(min >arr[j]){
                    min = arr[j];
                    int temp = arr[i];
                    arr[j] = temp;
                    arr[i] = min;
                    
                }
                
            }
            arr[i] = min;
        }
        
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
	}
}

    

