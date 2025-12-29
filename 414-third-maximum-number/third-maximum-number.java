class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> st=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }      
        if(st.size()<3){
            return st.last();
        }
        st.pollLast();
        st.pollLast();
        return st.last();
       
    

    }
}