class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!set.contains(nums1[i]))
            {
                set.add(nums1[i]);
            }
        }
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            if(set.contains(nums2[i])){
                if(!list.contains(nums2[i]))
                {
                    list.add(nums2[i]);
                }
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(int nums:list)
        {
            ans[i++]=nums;
        }
        return ans;
    }
}