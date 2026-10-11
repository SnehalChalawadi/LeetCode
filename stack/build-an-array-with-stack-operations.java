class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();

        int index=0;
        for(int i=1;i<=n;i++)
        {
            if(target.length==index)
            {
                break;
            }
            if(target[index]==i)
            {
                ans.add("Push");
                index++;
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }

        }

        return ans;
    }
}