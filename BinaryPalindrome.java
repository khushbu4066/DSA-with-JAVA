public class BinaryPalindrome {

   
    // Returns true if the binary representation of `n` is a palindrome
    public static boolean isPalindrome(int n)
    {
        // `rev` stores reverse of a binary representation of `n`
        int rev = 0;
 
        // do till all bits of `n` are processed
        int k = n;
        while (k > 0)
        {
            // add the rightmost bit to `rev`
            rev = (rev << 1) | (k & 1);
            k = k >> 1;     // drop last bit
        }
 
        // Returns true if `reverse(n)` is the same as `n`
        return n == rev;
    }
 
    public static void main(String[] args)
    {
        int n = 11;          // 1001
 
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome");
        }
        else {
            System.out.println(n + " is not a palindrome");
        }
    }
}

