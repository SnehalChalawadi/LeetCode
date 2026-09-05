class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxFrequency=0;
        int left=0;
        int maxlength=0;
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFrequency=Math.max(maxFrequency,map.get(ch));
            while((right-left+1)-maxFrequency > k)
            {
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            int length=right-left+1;
            maxlength=Math.max(maxlength,length);
        }
        return maxlength;
    }
}