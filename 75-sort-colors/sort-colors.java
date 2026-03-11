class Solution {
    public void sortColors(int[] nums) {
        int left=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[left];
                nums[left]=nums[mid];
                nums[mid]=temp;
                left++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int tem=nums[high];
                nums[high]=nums[mid];
                nums[mid]=tem;
                high--;
                
            }
        }

      
        

    }
}