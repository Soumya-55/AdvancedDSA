class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sum=new HashMap<>();
        int pre=0,ans=0;
        for(int i=0;i<nums.length;i++){
            pre=nums[i];
            if(sum.containsKey(target-pre)){
                return new int[]{sum.get(target-pre),i};
            }
            
            sum.put(pre,i);
            

        }
        return new int[]{};

    }
}