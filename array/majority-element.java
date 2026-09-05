class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int maxFrequency=0;
        int element=0;
        for(int num:map.keySet()){
            if(map.get(num)> nums.length/2 && map.get(num)>maxFrequency){
                element=num;
                maxFrequency=map.get(num);
            }    
        }
        return element;
    }
}