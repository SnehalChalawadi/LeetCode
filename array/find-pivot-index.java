class Solution {
    public int pivotIndex(int[] nums) {
        int[] leftSum=new int[nums.length];
        leftSum[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            leftSum[i]=nums[i]+leftSum[i-1];
        }

        int[] rightSum=new int[nums.length];
        rightSum[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        {
            rightSum[i]=nums[i]+rightSum[i+1];
        }

        for(int i=0;i<nums.length;i++)
        {
            int left = (i == 0) ? 0 : leftSum[i - 1];
            int right = (i == nums.length - 1) ? 0 : rightSum[i + 1];

            if(left==right)
            {
                return i;
            }
        }
        return -1;
    }
}