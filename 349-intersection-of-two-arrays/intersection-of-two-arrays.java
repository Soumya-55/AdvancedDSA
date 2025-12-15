class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        Set<Integer> result=new HashSet<>();
        for(int n:nums2){
            if(set1.contains(n)){
                result.add(n);
            }
        }
        int[] res=new int[result.size()];
        int j=0;
        for( int m:result){
            res[j++]=m;

        }
        return res;
    }
}