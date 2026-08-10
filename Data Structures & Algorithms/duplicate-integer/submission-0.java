class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]==nums[i]){
                    return true;
                }
            }
            
        }
        return false;
        
    }
}