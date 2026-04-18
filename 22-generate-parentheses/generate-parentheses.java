class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> string=new ArrayList<>();
       backtrack(0,0,string,"",n);
       return string;
        
    
    }
    private void backtrack(int open,int close,List<String> string,String current,int n){
        if(current.length()==2*n){
            string.add(current);
            return;

        }
        if(open<n){
            backtrack(open +1,close,string,current+"(",n);

        }
        if(open>close){
            backtrack(open,close+1,string,current+")",n);
        }
    }
}