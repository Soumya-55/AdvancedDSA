class Solution {
    public double myPow(double x, int n) {
        double pow=1;
        long nn=n;
        if(nn<0){
            nn=-1*nn;
        }
        while(nn>0){
            if(nn%2==1){
                pow=pow*x;
                nn=nn-1;
            }
            else{
                x*=x;
                nn=nn/2;
            }
        }
        if(n<0){
            pow=1.0/pow;
        }
    return pow;
    }
}