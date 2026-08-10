class Solution {
    public boolean isPalindrome(int x) {
        
       int n = x; 
       int last = 0;
       int rev = 0;
        while(x > 0)
        {
            last = x % 10;
            rev = (rev * 10) + last;
            x = x / 10;
        }

        return n == rev;
    }
}