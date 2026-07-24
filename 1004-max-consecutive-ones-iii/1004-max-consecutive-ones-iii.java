class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int cnt=0;
        int l=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cnt++;
            }
            if(cnt>k){
                if(nums[l]==0){
                    cnt--;
                }
                l++;
            }
        }
        return n-l;
    }
}