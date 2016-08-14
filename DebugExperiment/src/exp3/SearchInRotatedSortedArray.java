package exp3;

/**
 *
 * Specification in
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 *
 *
 */

public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		/**
		 * The whole program adopt a binary search strategy.
		 */
		while (start <= end) {
			int mid = start + (end - start) / 2;
			/**
			 * If the nums[mid] is the target, we just return it.
			 */
			if (nums[mid] == target) {
				return mid;
			}
			/**
			 * Then we check whether a num[start, end] is a consecutive one.
			 */
			if (nums[start] < nums[end]) {
				if (target > nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			} 
			/**
			 * If num[start, end] is not consecutive, we check whether 
			 * num[start, mid] and num[mid, end] is consecutive.
			 */
			else {
				/**
				 * check whether num[start, mid] is consecutive
				 */
				if (nums[start] < nums[mid]) {
					if (target > nums[start] && target < nums[mid]) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				} 
				/**
				 * otherwise, num[mid, end] must be consecutive
				 */
				else {
					if (target > nums[mid] && target < nums[end]) {
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				}
			}
		}

		return -1;
	}
	
//	public static void main(String[] args){
//		int[] nums = {3,4,5,6,7,8,9,0,1,2};
//		int target = 9;
//		
//		int actual = new SearchInRotatedSortedArray().search(nums, target);
//		int expected = 6;
//		System.out.println(expected == actual);
//	}
}
