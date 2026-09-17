class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0){
                sum=sum+customers[i];
            }
        }

        int maxSum=0;
        int left=0;
        int sum2=0;
        for(int right=0;right<customers.length;right++)
        {
            if((right-left+1)>minutes)
            {
                if(grumpy[left]==1){
                    sum2=sum2-customers[left];
                }
                left++;  
            }
            if(grumpy[right]==1)
            {
                sum2=sum2+customers[right];
            }
            maxSum=Math.max(maxSum,sum2);
        }
        return sum+maxSum;
    }
}