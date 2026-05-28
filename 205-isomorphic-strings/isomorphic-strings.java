class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() !=t.length()) return false;
        HashMap<Character,Character> st=new HashMap<>();
        HashMap<Character,Character> ts=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char chh=t.charAt(i);
            if(st.containsKey(ch)){
                if(st.get(ch)!=chh){
                    return false;
                }
            }
            else{
                if(ts.containsKey(chh)) return false;
            }
            

        
        st.put(ch,chh);
        ts.put(chh,ch);
        }

    return true;  
    }
}