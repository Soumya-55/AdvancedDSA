class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num ;i++){
            int rev = 0;
            int temp=i;
          while (temp!= 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp= temp / 10;
        }
          if(i+rev==num){
            return true;
        }
        }


    return false;   
    }
}