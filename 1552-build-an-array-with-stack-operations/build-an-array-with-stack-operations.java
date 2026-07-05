class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list=new ArrayList<String>();
        int ind=0;
        for(int i=1;i<=n;i++){
            if(target[ind]==i){
                list.add("Push");
                ind++;
                if(ind==target.length){
                    break;
                }
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}