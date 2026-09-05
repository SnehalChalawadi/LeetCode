class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!set.contains(nums1[i]))
            {
                set.add(nums1[i]);
            }
        }
        for(int i=0;i<nums2.length;i++)
        {
            if(!set2.contains(nums2[i]))
            {
                set2.add(nums2[i]);
            }
        }

        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();

        for(int num:set)
        {
            if(!set2.contains(num))
            {
                list1.add(num);
            }
        }
        ArrayList<Integer> list2=new ArrayList<>();
        
        for(int num:set2)
        {
            if(!set.contains(num))
            {
                list2.add(num);
            }
        }

        ans.add(list1);
        ans.add(list2);
        return ans;

    }
}