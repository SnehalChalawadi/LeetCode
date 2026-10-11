class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str=new StringBuilder();

        int open=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open++;
                str.append('(');
            }
            else if(ch==')')
            {
                if(open>0)
                {
                    open--;
                    str.append(')');
                }   
            }
            else{
                str.append(ch);
            }
        }
        for(int i=str.length()-1;i>=0 && open>0;i--)
        {
            char ch=str.charAt(i);
            if(ch=='(')
            {
                str.deleteCharAt(i);
                open--;
            }
        }
        return str.toString();
    }
}