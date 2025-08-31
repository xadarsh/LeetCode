class Solution {
    public boolean validPalindrome(String c){
        int left=0;
        int right=c.length()-1;

        while(left<right)
        {
            if(c.charAt(left)==c.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return isPalindrome(c,left+1,right) || isPalindrome(c,left,right-1);
            }
        }
        return true;
    }
    public static boolean isPalindrome(String s,int left,int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right++;

        }
        return true;
    }
}