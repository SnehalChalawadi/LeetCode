class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        double sum=0.0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        if((sum/k)>=threshold)
        {
            count++;
        }
        int left=0;
        for(int right=k;right<arr.length;right++)
        {
            sum=sum+arr[right]-arr[left];
            left++;
            if((sum/k)>=threshold)
            {
                count++;
            }   
        }
        return count;
    }
}