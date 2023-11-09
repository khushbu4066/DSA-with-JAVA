import java.util.*; 

public class BlockSwap {
    
    // Swapping r elements from starting of index a with r elements starting at index b
    public static void swap(int arr[], int a, int b, int r){ 
        for(int i = 0 ; i < r ; i++){ 
            int temp = arr[a + i]; 
            arr[a + i] = arr[b + i]; 
            arr[b + i] = temp; 
        } 
        
    }
    
    // Left rotating the array elements
    public static void leftRotate(int arr[], int r){ 
        int n = arr.length;
        
        // If the no of elements to rotate = 0 or equal to size of array
        if(r == 0 || r == n) return; 
        
        int i = r; 
        int j = n - r; 

        // Perform block swaps till the size of 2 subarrays is not equal
        while (i != j){   
            // A's size is less
            if(i < j){ 
                swap(arr, r-i, r+j-i, i); 
                j = j - i; 
            } 
            // B's size is less
            else{ 
                swap(arr, r-i, r, j); 
                i = i - j; 
            } 
        }
        
        // Finally at the end, block swap elements of A and B
        swap(arr, r-i, r, i); 
    } 

    
    // Main function
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array");
        for (int i = 0; i < n; i++) 
        arr[i] = sc.nextInt();
        
        System.out.println("Enter the number of rotations");
        int no_of_rotations = sc.nextInt();
        
        leftRotate(arr, no_of_rotations); 
        
        System.out.println("Array Elements after rotating : "); 
        for(int i = 0 ; i < n ; i++){   
            System.out.print(arr[i] + " "); 
        }
    }  
}
// public class BlockSwap{
//         public void rotate(int[] nums, int k) {
//           k %= nums.length;
//           reverse(nums, 0, nums.length - 1);
//           reverse(nums, 0, k - 1);
//           reverse(nums, k, nums.length - 1);
//         }
      
//         private void reverse(int[] nums, int l, int r) {
//           while (l < r)
//             swap(nums, l++, r--);
//         }
      
//         private void swap(int[] nums, int l, int r) {
//           final int temp = nums[l];
//           nums[l] = nums[r];
//           nums[r] = temp;
//         }
//     }

    

