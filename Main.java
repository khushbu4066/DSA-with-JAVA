import java.util.Arrays;

public class Main {

// {

//                public static void main(String[] args) {

//                    short s=8;

//                    s=(short) (s*4);

//                               System.out.println(s);

//                }

// }
    
int max_equilibrium_sum(int arr[], int n) {
    int max_sum = 0;
    int left_sum = 0;
    int right_sum = 0;
    
    // iterate through all indices in the array
    for (int i = 0; i < n; i++) {
        // calculate the sum of all elements to the left of the index
        left_sum = 0;
        for (int j = 0; j < i; j++) {
            left_sum += arr[j];
        }
        
        // calculate the sum of all elements to the right of the index
        right_sum = 0;
        for (int j = i + 1; j < n; j++) {
            right_sum += arr[j];
        }
        
        // check if this index is an equilibrium point
        if (left_sum == right_sum) {
            // calculate the total sum at this equilibrium point
            int total_sum = left_sum + right_sum + arr[i];
            // update the maximum equilibrium sum if necessary
            if (total_sum > max_sum) {
                max_sum = total_sum;
            }
        }
    }
    
    return max_sum;
}

int main() {
    int arr[] = {-1, 26, -2, 1, -22, 6, 17, 23};
    int n = sizeof(arr) / sizeof(arr[0]);
    int max_eq_sum = max_equilibrium_sum(arr, n);
    cout << "Maximum equilibrium sum: " << max_eq_sum << endl;
    return 0;
}
