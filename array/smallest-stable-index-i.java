class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
            int max=nums[i];
            int min=nums[i];
            int j=0;
            while(j<=i)
            {
                max=Math.max(max,nums[j]);
                j++;
            }
            j=nums.length-1;
            while(j>=i){
                min=Math.min(min,nums[j]);
                j--;
            }
            int score=max-min;
            if(score<=k)
            {
                return i;
            }
        }
        return -1;
    }
}