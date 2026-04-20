class Solution {
    public int maxDistance(int[] colors) {
        int right=colors.length-1, max=Integer.MIN_VALUE;
        int left=0;
        for(int i=colors.length-1;i>=0;i--){
            if(colors[left]!=colors[i]){
                max=Math.max(max,(i-0));
                break;
            }
        }
           for(int j=0;j<colors.length;j++){
            if(colors[right]!=colors[j]){
                 max=Math.max(max,(right-j));
                 break;
            }
           }
       
        
        
        return max;
    }
}