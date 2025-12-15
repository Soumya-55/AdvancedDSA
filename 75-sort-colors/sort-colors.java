class Solution {
    public void sortColors(int[] nums) {
        int count0=0,count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) count0++;
            else if( nums[i]==1) count1++;
            else count2++;

           
        }
        int in=0;
        for(int i=0;i<count0;i++) nums[in++]=0; 
        for(int j=0;j<count1;j++) nums[in++]=1; 
        for(int k=0;k<count2;k++) nums[in++]=2; 

    }
}