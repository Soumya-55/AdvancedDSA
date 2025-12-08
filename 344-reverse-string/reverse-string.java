class Solution {
    public void reverseString(char[] s) {
        int high=s.length-1;
        int slow=0;
        while(slow<high){
            char temp=s[slow];
            s[slow]=s[high];
            s[high]=temp;
            high--;
            slow++;
            
        }
    }
}