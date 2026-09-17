class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double MaxAvg=0.0;
        double sum=0;
        for(int right=0;right<nums.length;right++)
        {
            sum=sum+nums[right];
            if((right-left+1) > k)
            {
                sum=sum-nums[left];
                left++;
            }
            double avg=sum/k;
            MaxAvg=Math.max(MaxAvg,avg);
        }
        return MaxAvg;
    }
}