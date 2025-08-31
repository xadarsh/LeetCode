class Solution {
    public void reverseString(char[] c) {
        reverse (c,0);
    }

    public static void reverse(char[] c,int index)
    {
        if(index>=c.length/2)
        {

        }
        else
        {
            char temp=c[index];
            c[index]=c[c.length-1-index];
            c[c.length-1-index]=temp;
            reverse(c,++index);

        }
        
    }
}