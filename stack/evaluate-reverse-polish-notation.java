class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<tokens.length;i++)
        {
            String token=tokens[i];
            int result=0;
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))
            {
                int a=stack.pop();
                int b=stack.pop();
                if(token.equals("+"))
                {
                    result=b+a;
                }
                if(token.equals("-"))
                {
                    result=b-a;
                }
                if(token.equals("*"))
                {
                    result=b*a;
                }
                if(token.equals("/"))
                {
                    result=b/a;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}