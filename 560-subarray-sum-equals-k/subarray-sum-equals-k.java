class Solution {
    public int subarraySum(int[] nums, int k) {
      
       Map<Integer , Integer> sum=new HashMap<>();
       sum.put(0,1);
       int res=0;
       int prefix=0;
       for(int i=0;i<nums.length;i++){
        prefix+=nums[i];
        if(sum.containsKey(prefix-k)){
        res+=sum.get(prefix-k);
        
        }
        sum.put(prefix,sum.getOrDefault(prefix,0)+1);
        


       }
        
     
      
        return res;
    }
}