class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr)
        {
            if(num==0)
            {
                list.add(0);
            }
            list.add(num);
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=list.get(i);
        }
    }
}