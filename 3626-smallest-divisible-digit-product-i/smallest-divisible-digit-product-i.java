class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true)
        {
            if(digitProduct(n) % t == 0)
            {
                return n;
            }
            else{
                n++;
            }
        }
    }
    private int digitProduct(int number)
        {
            int product = 1;
            while(number > 0)
            {
                product *= number % 10;
                number /= 10;
            }
            return product;
        }
}
