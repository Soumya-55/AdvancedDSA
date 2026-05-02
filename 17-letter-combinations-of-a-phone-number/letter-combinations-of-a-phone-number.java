class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits==null || digits.length()==0) {
            return result;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,result,0,map,new StringBuilder());
        return result;

    }
    public void backtrack(String digits,List<String> result,int index,String[] map,StringBuilder current){
        if(index==digits.length()){
            result.add(current.toString());
            return;

        }
        String letters=map[digits.charAt(index)-'0'];

        for(char ch:letters.toCharArray() ){
            current.append(ch);
            backtrack(digits,result,index+1,map,current);
            current.deleteCharAt(current.length()-1);
        }
    }
}