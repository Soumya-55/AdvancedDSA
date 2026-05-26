class Solution {
    public int findMin(int[] nums) {
        int low=0,high=nums.length-1,mini=nums[0];
        while(low<=high){
            if(nums[low]<=nums[high]){
                mini=Math.min(mini,nums[low]);
                break;
            }
            int mid=low+(high-low)/2;
            if(nums[mid]>=nums[low]){
               mini=Math.min(mini,nums[low]);
               low=mid+1;
            }
            else {
                mini=Math.min(mini,nums[mid]);
                high=mid-1;
            }

            


            
        }
        return mini;
    }
}