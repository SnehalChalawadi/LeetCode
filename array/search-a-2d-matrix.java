class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rs=0;
        int re=matrix.length-1;
        while(rs<=re){
            int midR=rs+(re-rs)/2;
            if (matrix[midR][0]<=target && target<=matrix[midR][matrix[0].length-1])
            {
                int left=0;
                int right=matrix[0].length-1;
                while(left<=right)
                {
                    int mid=left+(right-left)/2;
                    if(target==matrix[midR][mid])
                    {
                        return true;
                    }
                    if(target < matrix[midR][mid])
                    {
                        right=mid-1;
                    }
                    else{
                        left=mid+1;
                    }
                }
                return false;
            }
            if(target<=matrix[midR][0])
            {
                re=midR-1;
            }
            else
            {
                rs=midR+1;
            }
        }
        return false;
    }
}