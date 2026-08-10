class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i] + nums[j]== target){
                    int[] arr={j,i};
                    return arr;
                    
                }
            }
        }
        return null;
        
        
    }
}
