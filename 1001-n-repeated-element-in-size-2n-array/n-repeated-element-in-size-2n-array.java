class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
                if(nums[i]==nums[i+1]){
                   return nums[i];
                   
                }
                if(i+2<n && nums[i]==nums[i+2]){
                    return nums[i];
                }
        }
                if(n==4){
                    if(nums[0]==nums[3]) return nums[0];
                    if(nums[1]==nums[2]) return nums[1];
                }

            
         
            

        
        return -1;
    }
}