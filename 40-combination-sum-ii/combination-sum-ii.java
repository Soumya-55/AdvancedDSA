class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(new ArrayList<>(),0,candidates,target,list);
        return list;

    }
    public void backtrack(List<Integer> temp,int start,int[] candidates,int target,List<List<Integer>> list ){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;

        }
        for(int i=start;i<candidates.length;i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
           
            if(candidates[i]>target) break;
            temp.add(candidates[i]);
            backtrack(temp,i+1,candidates,target-candidates[i],list);
            temp.remove(temp.size()-1);
        }


    }
}