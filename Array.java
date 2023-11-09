import java.util.Scanner;

//User defined 1-d ARRay

// public class Array {
//     public static void main(String args[]){
//         int n;
//         Scanner s = new Scanner(System.in);
//         {
//             System.out.println("Enter no. of elements in array");
//             n = s.nextInt();
//             int a[] = new int[n];
//             System.out.println("Enter values");
//             for(int i = 0; i<n; i++){
//                 a[i] = s.nextInt();
//             }
//             System.out.println("Print array");
//             for(int i=0; i<n ; i++){
//                 System.out.println(a[i]);
//             }
//         }
//     }
// }

// User defined 2-D Array

public class Array {
        public static void main(String args[]){
         int n , m , i , j;
         Scanner s = new Scanner(System.in);
         System.out.println("Enter row");
          n = s.nextInt();
          System.out.println("Enter value");
          m = s.nextInt();
          int a[][] = new int[n][m];
          for( i = 0; i<n ; i++){
            for( j = 0; j<m; j++){
                a[i][j] = s.nextInt();
            }
          }
        }

        public static void fill(boolean[] x, boolean b) {
        }
    }
