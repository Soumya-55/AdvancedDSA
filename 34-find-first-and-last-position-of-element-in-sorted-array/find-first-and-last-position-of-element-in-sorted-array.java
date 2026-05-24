class Solution {
    public int[] searchRange(int[] nums, int target) {
        int one=first(nums,target);
        int two=second(nums,target);
        
    return new int[]{one,two}; 
    }
    public int second(int[] arr,int target){
        int low=0,high=arr.length-1,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;

            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return ans;

    }
    public int first(int[] arr,int target){
        int low=0,high=arr.length-1,ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
        
            if(arr[mid]==target){
                ans=mid;
                high= mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;

            }

        }
        return ans;
    }
}