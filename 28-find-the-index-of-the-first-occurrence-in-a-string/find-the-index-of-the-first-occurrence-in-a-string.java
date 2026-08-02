class Solution {
    public int strStr(String haystack, String needle) {
        
        int n = needle.length();
        for(int i = 0; i <= haystack.length() - n; i++)
        {
            String t = "";
            for(int j = i; j < i + n; j++ )
            {
                t = t + haystack.charAt(j);
            }
            if(t.equals(needle))
            {
                return i;
            }
        }
        return -1;
    }
}