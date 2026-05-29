class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        int[] number=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
         min=Math.min(min,digit(x));

        }
        return min;
    }
    public static int digit(int x){
        int sum=0;
        while(x>0){
            sum +=x%10;
            x=x/10;
        }
        return sum;
    }
}