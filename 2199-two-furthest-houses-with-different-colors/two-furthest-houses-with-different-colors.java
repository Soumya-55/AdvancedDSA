class Solution {
    public int maxDistance(int[] colors) {
        int x=0 , max=Integer.MIN_VALUE;
        for(int i=0;i<colors.length;i++){
           for(int j=1;j<colors.length;j++){
            int  count=0;
            if(colors[i]!=colors[j]){
                count++;
                
            }


        
        if(count==1){
             x= Math.abs(i-j);
        }
        max=Math.max(max,x);
        }
        }
        return max;
    }
}