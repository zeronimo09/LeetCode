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

Notes: In linear Search, nums[i]>= target will check if the target is found or it should be inserted if its not found in the array 


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

Logic:
1. we return left to avoid Index out of bounds for left and right pointers when only one integer is given in nums array and we need to find an element to put after or before its position.
examples: 
nums = [2], target = 3
nums = [2], target = 1

Why: 
1. If we search for whole array using linear search then the Time complexity is O(n).
2. Since we are given a sorted array we should choose binary search for searching. Time complexity is O(logn). Because Binary search will cancel out half the array when traversing.
    
