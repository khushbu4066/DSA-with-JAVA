public class LongestOne {
        public static void main (int[] A, int K) {
              int left = 0; 
          int right;
          for (right = 0; right < A.length; right++) {
            if (A[right] == 0) {
              K--;
            }
      
            if (K < 0) {
              if (A[left] == 0) {
                K++;
              }
              left++;
            }
          }
      
          return right - left;
        }
      }

