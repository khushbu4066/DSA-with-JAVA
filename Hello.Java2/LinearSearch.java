import java.util.Scanner;

public class LinearSearch {
    public static int search(int arr[], int x){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            if(arr[i] == x)
                return i;
        }  
        return -1;
      }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array");
        for (int k = 0; k< n; k++) 
        arr[k] = sc.nextInt();

        System.out.println("Enter key element:");
        int x = sc.nextInt();

        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }
}

