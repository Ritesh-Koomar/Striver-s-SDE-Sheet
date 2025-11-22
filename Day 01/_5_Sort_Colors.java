class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int m = 0;
        int e = nums.length - 1;
        while(m <= e)
        {
            if(nums[m] == 1)
            {
                m++;
            }
            else if(nums[m] ==  0)
            {
                int t = nums[s];
                nums[s] = nums[m];
                nums[m] = t;
                s++;
                m++;
            }
            else if(nums[m] ==  2)
            {
                int t = nums[e];
                nums[e] = nums[m];
                nums[m] = t;
                e--;
            }
        }
    }
}
