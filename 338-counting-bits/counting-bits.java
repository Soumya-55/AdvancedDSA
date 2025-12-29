class Solution {
    public int[] countBits(int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<=n;i++){
           String st= Integer.toBinaryString(i);
           int count=0;
           for(int j=0;j<st.length();j++){
            if(st.charAt(j)=='1') {
                count++;
           }
           ans[i]=count;
        }
        }
        return ans;
    }
}