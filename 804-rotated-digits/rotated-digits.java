class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=0;i<=n;i++){
            if(isgood(i)){
                count++; 
            }

        }
        return count;
    }
    public boolean isgood(int num){
        boolean change=false;
        while(num>0){
            int digit =num%10;
        if(digit==3|| digit==4||digit==7){
            return false;
        }
        if(digit==2|| digit==5 || digit==6|| digit==9){
            change= true;
        }
        num/=10;
        }
        return change;
    }
}