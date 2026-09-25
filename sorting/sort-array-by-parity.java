class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[j]%2 ==0)
            {
                j++;
                continue;
            }
            if(nums[i]%2 ==0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}