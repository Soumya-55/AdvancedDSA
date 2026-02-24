class Solution {
    public int maxVowels(String s, int k) {
        int c=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                c++;
            }
            if(i>k-1 && isvowel(s.charAt(i-k))){
                c--;
            }
                ans=Math.max(c,ans);
        
        }
            return ans;
        
    }
    private boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}