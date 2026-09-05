class Solution {
    public int SumSqr(int n){
        int sumSqr=0;
        while(n!=0)
        {
            int digit=n%10;
            n=n/10;

            sumSqr+=digit*digit;
        }
        return sumSqr;
    }
    public boolean isHappy(int n) {
       int slow=n;
       int fast=n;
       while(n!=1){
        slow=SumSqr(slow);
        fast=SumSqr(SumSqr(fast));
        if(fast==1)
        {
            return true;
        }
        if(fast == slow)
        {
            return false;
        }
       }
       return true;
    }
}