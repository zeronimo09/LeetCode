//https://leetcode.com/problems/search-insert-position

/*Linear Search*/
class Solution {
    public int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
        }
    }


// Binary Search
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left =0;
        int right = nums.length -1;
        while(left<=right){ 
        int mid = (left + right)/2;
        if (nums[mid] == target){
            return mid;
        } else if(target > nums[mid]){
            left = mid +1;
        } else if (target < nums[mid]){
            right = mid-1;
        }
        }
        return left;
       } 
    }
