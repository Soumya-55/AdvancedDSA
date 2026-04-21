class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int m=0, min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               m= Math.abs(i-start);
               min=Math.min(min,m);
            }
        }
        return min ;
    }
}