class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();

        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                count++;
                if(count>1){
                    str.append('(');
                }
            }
            else{
                count--;
                if(count>0)
                {
                    str.append(')');
                }
            }
            
        }

        return str.toString();
        
    }
}