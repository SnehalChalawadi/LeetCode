class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        for(int j=0;j<t.length();j++)
        {
            if(s.length()==0)
            {
                return true;
            }
            if(i < s.length() && s.charAt(i)==t.charAt(j))
            {
                i++;
            }
        }
        if(s.length() == i)
        {
            return true;
        }
        return false;
    }
}