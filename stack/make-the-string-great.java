class Solution {
    public String makeGood(String s) {
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() && 
            Character.toLowerCase(stack.peek())==Character.toLowerCase(s.charAt(i))  && 
            Character.isUpperCase(stack.peek())!= Character.isUpperCase(s.charAt(i)) )
            {
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }

        StringBuilder str=new StringBuilder();
        for(char ch:stack)
        {
            str.append(ch);
        }

        return str.toString();
    }
}