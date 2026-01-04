class Solution {
    public String addBinary(String a, String b) {
        String st=new String();
        int carry=0;
        int j=b.length()-1;
        int i=a.length()-1;
        while(i>=0 || j>=0){
            int bita= (i>=0)? a.charAt(i)-'0':0;
            int bitb= (j>=0)?  b.charAt(j)-'0':0;
            int sum=bita+bitb+carry;
            st=(sum%2)+st;
            carry=sum/2;
            j--;
            i--;

            
        }
           
                    
                
        if(carry==1) st='1'+st;       
    return st;    
    }
}