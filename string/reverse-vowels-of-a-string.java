class Solution {
    public String reverseVowels(String s) {
        char[] sb=s.toCharArray();

        int left=0;
        int right=sb.length-1;
        while(left<right)
        {
            if(sb[left]!='a'&& sb[left]!='e'&& sb[left]!='i'&& sb[left]!='o'&& sb[left]!='u'&& sb[left]!='A'&& sb[left]!='E'&& sb[left]!='I' && sb[left]!='O' && sb[left]!='U')
            {
                left++;
                continue;
            }
            if(sb[right]!='a'&& sb[right]!='e'&& sb[right]!='i'&& sb[right]!='o'&& sb[right]!='u'&& sb[right]!='A' && sb[right]!='E'&& sb[right]!='I'&& sb[right]!='O'&& sb[right]!='U')
            {
                right--;
                continue;
            }


            char temp=sb[left];
            sb[left]=sb[right];
            sb[right]=temp;

            left++;
            right--;
        }
        return new String(sb);
    }
}