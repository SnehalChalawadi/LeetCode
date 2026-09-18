class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        HashSet<String> set=new HashSet<>();
        for(String word:words)
        {
            String code="";
            for(int j=0;j<word.length();j++)
            {
                char ch=word.charAt(j);
                code=code+morse[ch-'a'];
            }
            set.add(code);
        }

        return set.size();
    }
}