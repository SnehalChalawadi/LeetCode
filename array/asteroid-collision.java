class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack =new Stack<>();

        for(int i=0;i<asteroids.length;i++)
        {
            int num=asteroids[i];
            if(num>=0)
            {
                stack.push(num);
            }
            else{
                boolean destroyer=false;
                while(!stack.isEmpty() && stack.peek()>=0)
                {
                    if(stack.peek()==Math.abs(num))
                    {
                        stack.pop();
                        destroyer=true;
                        break;
                    }
                    if(stack.peek()>Math.abs(num))
                    {
                        destroyer=true;
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(!destroyer)
                {
                    stack.push(num);
                }
            }
        }

        int[] nums=new int[stack.size()];
        int i=0;
        for(int num:stack)
        {
            nums[i++]=num;
        }

        return nums;
    }
}