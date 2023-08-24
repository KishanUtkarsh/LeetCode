class Solution {
    public void rotate(int[] nums, int k) {
        int start = 0;
        int end = nums.length -1;
        reverse(nums , start , end);
        if(nums.length < k){
            reverse(nums,k%nums.length,end);
            reverse(nums,start,(k-1)%nums.length);
        }else{
            reverse(nums , start , k-1);
            reverse(nums , k , end);
        }
        
        
    }
    
    public static void reverse(int[] arr , int start , int end){
        while(end > start){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;            
        }
    }
}