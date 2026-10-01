class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for( int i =0; i< operations.length;i++)
        {
            // if(stack.isEmpty() && (operations[i]=="C" || operations[i]=="D" || operations[i]=="+"))
            // {
            //     return null;
            // }

            if(!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+"))
            {
                int value=Integer.parseInt(operations[i]);
                stack.push(value);
            }
            else{
                if(operations[i].equals("+"))
                {
                    int a=stack.peek();
                    int b=stack.get(stack.size()-2);

                    stack.push(a+b);
                }

                else if(operations[i].equals("D"))
                {
                    int a=stack.peek();
                    stack.push(a*2);
                }
                else{
                    stack.pop();
                }

            }
            
        }
        int sum=0;
        while(!stack.isEmpty())
        {
            sum=sum+stack.pop();
        }
        return sum;
    }
}