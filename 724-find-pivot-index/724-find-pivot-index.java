class Solution {
    public int pivotIndex(int[] nums) {
         int result=-1;
        int leftSum=0,rightSum=0;
    
        for(int i=0;i<nums.length;i++){
            if(i==0){
                leftSum=0;
                rightSum=totalSum(nums,i+1,nums.length-1);
            }
            else if(i==nums.length-1){
                leftSum=totalSum(nums,0,i-1);
                rightSum=0;
            }
            else{
                  leftSum=totalSum(nums,0,i-1);
                  rightSum=totalSum(nums,i+1,nums.length-1);
            }
            if(leftSum==rightSum){
                result=i;
                break;
            }
            
        }
        
        return result;
        
    }
    
    int totalSum(int[] nums, int l, int r){
        int sum=0;
        for(int j=l;j<=r;j++){
            sum+=nums[j];
        }
        return sum;
    }
    
}