class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int left=j+1;
                int right=nums.length-1;
                while(left<right)
                {
                    long sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                      List<Integer> list=new ArrayList<>();

                      list.add(nums[i]);
                      list.add(nums[j]);
                      list.add(nums[left]);
                      list.add(nums[right]);

                      if(!ans.contains(list))
                      {
                        ans.add(list);
                      }
                    }

                    if(sum<target)
                    {
                      left++;
                    }
                    else{
                      right--;
                    }

                }
            }
        }
        return ans;
    }
}