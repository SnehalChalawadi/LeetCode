class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=find(nums,target,true);
        int second=find(nums,target,false);

        return new int[]{first,second};
    }
    private int find(int[] nums,int target,boolean isFirst)
    {
        int left=0;
        int right=nums.length-1;
        int answer=-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                answer=mid;
                if(isFirst)
                {
                   right=mid-1; 
                }
                else{
                    left=mid+1;
                }
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return answer;
    }
}
    
//     private int findLast(int[] nums,int target)
//     {
//         int left=0;
//         int right=nums.length-1;
//         int answer=-1;
//         while(left<=right)
//         {
//             int mid=left+(right-left)/2;
//             if(nums[mid]==target)
//             {
//                 answer=mid;
//                 left=mid+1;
//             }
//             else if(nums[mid]<target)
//             {
//                 left=mid+1;
//             }
//             else
//             {
//                 right=mid-1;
//             }
//         }
//         return answer;
//     }
// }