class Solution {
    public long gcdSum(int[] nums) {
        int mx=nums[0];
        int[] prefixgcd=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           mx=Math.max(mx,nums[i]);
            prefixgcd[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefixgcd);
        long sum=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            sum +=gcd(prefixgcd[left],prefixgcd[right]);
            left++;
            right--;

        }
        return sum;

    }
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;

        }
        return a;

    }
}