class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result=new ArrayList<>();
        String digits="123456789";
        int lowlen=String.valueOf(low).length();
        int highlen=String.valueOf(high).length();

        for(int i=lowlen;i<=highlen;i++){
            for(int j=0;i+j<=9;j++){
                int num=Integer.parseInt(digits.substring(j,i+j));
                if(num>=low && num<=high){
                    result.add(num);

                }

            }
        }
        return result;
    }
}