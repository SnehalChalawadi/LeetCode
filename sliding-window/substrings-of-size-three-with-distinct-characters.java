class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        int left=0;
        HashSet<Character> set=new HashSet<>();
        for(int right=0;right<s.length();right++){
            if((right-left+1)>3)
            {
                char ch=s.charAt(left);
                set.remove(ch);
                left++;
            }
            char c=s.charAt(right);
            if(set.contains(c)){
                left++;
                continue;
            }
            set.add(c);
            if((right-left+1)==3)
            {
                count++;
            }
        }
        return count;
    }
}