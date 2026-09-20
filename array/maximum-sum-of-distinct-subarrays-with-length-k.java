class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       long MaxSum=0;
       int left=0;

       long sum=0;
       HashSet<Integer> set=new HashSet<>();
       for(int right=0;right<nums.length;right++)
       {
        while(set.contains(nums[right]))
        {
          sum=sum-nums[left];
          set.remove(nums[left]);
          left++;  
        }

        sum=sum+nums[right];
        set.add(nums[right]);

        if((right-left+1)>k)
        {
            sum=sum-nums[left];
            set.remove(nums[left]);
            left++;
        }

        if((right-left+1)==k)
        {
            MaxSum=Math.max(sum,MaxSum);
        }
       } 
       return MaxSum;
    }
}