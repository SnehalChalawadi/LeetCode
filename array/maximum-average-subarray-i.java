class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0.0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double maxSum=sum;
        int left=0;
        for(int right=k;right<nums.length;right++)
        {
            sum=sum-nums[left]+nums[right];
            maxSum=Math.max(maxSum,sum); 
            left++;  
        }
        return maxSum/k;
    }
}