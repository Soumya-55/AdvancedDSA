class Solution {
    public int majorityElement(int[] nums) {//boyer moore voting algorithm 
        int count=0, candidate=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
                //count=1;
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}