class Solution {
    public int maxDepth(String s) {
        int depth=0,max_len=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            max_len=Math.max(max_len,depth);
            }
            else if(s.charAt(i)==')'){
                depth--;
            }
        }
    return max_len;   
    }
}