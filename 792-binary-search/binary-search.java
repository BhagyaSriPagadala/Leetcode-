class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        
        int h=n-1;

        while(l<=h)
        {
            
            int mid=l+(h-l)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }    
                return -1;

}
}
