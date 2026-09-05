class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile=piles[0];
        for(int i=1;i<piles.length;i++)
        {
            maxPile=Math.max(maxPile,piles[i]);
        }
        int left=1;
        int right=maxPile;
        while(left<=right)
        {
            int k=left+(right-left)/2;
            long hours=0;
            for(int i=0;i<piles.length;i++)
            {
                hours+=(piles[i]+k-1)/k;
            }

            if(hours<=h)
            {
                right=k-1;
            }
            else{
                left=k+1;
            }
        }
        return left;
    }
}