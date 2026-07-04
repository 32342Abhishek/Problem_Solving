class Solution {
    public boolean checkGoodInteger(int n) {
        int ds=0;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            ds+=digit;
            sum+=digit*digit;
            n/=10;

        }
        if(sum-ds>=50){
            return true;
        }
        return false;

    }
}