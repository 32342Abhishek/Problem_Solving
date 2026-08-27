class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    int total=0;
  
    int csum=nums[0];
    int cmin=nums[0];
    int maxsum=nums[0];
    int minsum=nums[0];
    for(int i=0;i<nums.length;i++){
        total+=nums[i];
       if (i > 0) {
                csum = Math.max(nums[i], csum + nums[i]);
                maxsum = Math.max(maxsum, csum);

                cmin = Math.min(nums[i], cmin + nums[i]);
                minsum = Math.min(minsum, cmin);
            }
      

    }
    if(maxsum<0){
        return maxsum;
    }
    int ans=total-minsum;
    return Math.max(maxsum,ans);

    
          
       
    }
}