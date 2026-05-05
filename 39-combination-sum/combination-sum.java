class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        backtrack(0,candidates,target,new ArrayList<>(),list);
        return list ; 
    }
    public void backtrack(int start,int[] candidates,int target,List<Integer> temp,List<List<Integer>> list ){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>target) continue;
            temp.add(candidates[i]);

            backtrack(i,candidates,target-candidates[i],temp,list);
            temp.remove(temp.size()-1);

        }
    }

    
}