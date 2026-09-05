class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            int num=entry.getKey();
            int freq=entry.getValue();

            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(num);
        }

        int[] ans=new int[k];
        int index=0;
        for(int i=bucket.length-1;i>=0;i--)
        {
            if(bucket[i]!=null)
            {
                for(int j=0;j<bucket[i].size() && index<k;j++)
                {
                    ans[index++]=bucket[i].get(j);
                }
            }
        }
        return ans;
    }
}