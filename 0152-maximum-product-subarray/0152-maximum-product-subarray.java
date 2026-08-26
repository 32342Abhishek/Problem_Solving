class Solution {
    public int maxProduct(int[] nums) {
       int cp=nums[0];
       int cmin=nums[0];
        int  mp=nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i] < 0) {
                int temp = cp;
                cp = cmin;
                cmin = temp;
            }

            cp = Math.max(nums[i], cp * nums[i]);
            cmin = Math.min(nums[i], cmin * nums[i]);

            mp = Math.max(mp, cp);
        
        }
        return mp;
    }
}