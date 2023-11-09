import java.util.Scanner;  
  
public class SeiveAlgo  {  
   public static void main(String args[]) {  

      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter a number");  
      int num = sc.nextInt();  

      boolean[] bool = new boolean[num];  
       
      for (int i = 0; i< bool.length; i++) {  
         bool[i] = true;  
      } 

      for (int i = 2; i< Math.sqrt(num); i++) {  
         if(bool[i] == true) {  
            for(int j = (i*i); j<num; j = j+i) {  
               bool[j] = false;  
            }  
        } 
    } 
       


      System.out.println("List of prime numbers upto given number are : ");  
      for (int i = 2; i< bool.length; i++) {  
         if(bool[i]==true) {  
            System.out.println(i);  
         }  
      }  
   } 
} 


// Leetcode solutions

// class Solution {
//     public int countPrimes(int n) {
//         if (n < 2) return 0;
//         boolean[] nonPrime = new boolean[n];
//         nonPrime[1] = true;
//         int numNonPrimes = 1;
//         for (int i=2; i < n; i++) { // O(n)
//             if (nonPrime[i]) continue;
//             int j = i * 2;
//             while (j < n) { // O(log(log(n)))
//                 if (!nonPrime[j]) {
//                     nonPrime[j] = true;
//                     numNonPrimes++;
//                 }
//                 j += i;
//             }
//         }
//         return (n-1) - numNonPrimes;
//     }
// }


// 2nd

// import java.util.*;
// class Solution {
//     public static int countPrimes(int n) {
//         boolean[] isPrime = new boolean[n];
//         int count = 0;
//         for (int i = 2; i < n; i++) {
//             if (!isPrime[i]) {
//                 count++;
//                 for (int j = 2; i*j < n; j++) {
//                     isPrime[i*j] = true;
//                 }
//             }
//         }
//         return count;
//     }
// }