class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder res= new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='a' && c <='z' || c>='0' && c<='9')
            {
                res.append(c);
            }
        }

        return checkPalindrome(res.toString(),0);
    }

    public static boolean checkPalindrome(String res, int index)
    {
        if(index>=res.length()/2)
        {
            return true;
        }
        else if(res.charAt(index)==res.charAt(res.length()-1-index) )
        {
            //return false;
            return checkPalindrome(res,index+1);
        }
        return false;
        //return checkPalindrome(res,index+1);
    }
}