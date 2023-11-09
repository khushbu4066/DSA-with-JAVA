import java.util.Scanner;

// Maximum product of Sub Array
public class MaximumProduct {

    private static final String String = null;

    public static int main(int arr[]){

    int n = arr.length;
    int result = arr[0];


    for(int i = 0; i<n; i++){
        int mul = arr[i];
        for(int j = 0; j<n; j++){
            mul *= arr[j];
        }
        result = Math.max(result, mul);
    }
    
    return result;
    } 

    // Driver code
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        String arr = sc.next();
        System.out.println("Maximum Sub array product is " + MaximumProduct(String));
    }

}

