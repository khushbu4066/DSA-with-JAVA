import java.util.Scanner;

public class LeaderArr {

//  public static void main(String[] args) {


// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[] = new int[n];

// for(int k =0; k<n; k++){
//  arr[k] = sc.nextInt();
// }

// int leader = arr[n-1];
// System.out.print(leader);
// for(int i=n-2; i>=0; i--){

// if(leader <arr[i]){
// leader = arr[i];

// System.out.print(" "+leader);


// }
// }
// }
// }

       public static void getResult(int arr[], int n)
       {
              for (int i = 0; i < n; i++)
              {
                     int j;
                     for (j = i + 1; j < n; j++)
                     {
                            if (arr[i] <=arr[j])
                          {
                                   break;
                          }
                     }
                    
                    // The loop didn't break
                     if (j == n)
                   {
                            System.out.print(arr[i] + " ");
                   }
              }
       }

       public static void main(String[] args)
       {
        LeaderArr res = new LeaderArr();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements of the array");
        for (int k = 0; k< n; k++) 
        arr[k] = sc.nextInt();

             System.out.println("Leader Array is :");
        
             LeaderArr.getResult(arr, n);
       }
}

//12,5,12,10,12,10,4,8,7,8,1