package exp2;
import java.util.HashMap;

/**
 *
 * Specification in https://leetcode.com/problems/longest-consecutive-sequence/
 *
 *
 */

public class LongestConsecutiveSequence {

	public int longestConsecutive(int[] nums) {
		int recordedMaxLength = 0;
		
		/** 
		 * record the element with value <code>k</code> in <code>nums</code> belonging 
		 * to a sequence of length <code>l</code>
		 */
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<nums.length; i++) {
			int n = nums[i];
			
			/** the length of sequence whose right boundary is n-1 */
			int left = (map.containsKey(n - 1)) ? map.get(n - 1) : 0;
			
			/** the length of sequence whose left boundary is n+1 */
			int right = (map.containsKey(n + 1)) ? map.get(n + 1) : 0;
			
			/** 
			 * sum is the length of "merged" sequence after considering
			 * the number <code>n</code>
			 */
			int sum = left + right + 1;
			map.put(n, sum);

			/** record the max length */
			recordedMaxLength = Math.max(recordedMaxLength, sum);

			/** extend the length to the boundary(s) of the sequence*/
			map.put(n - left, sum);
			map.put(n + right, sum);
		}
		
		return recordedMaxLength;
	}
	
//	public static void main(String[] args){
//		LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
//        int num[] = {100, 99, 1, 2, 3, 5, 7, 11, 4, 102, 101};
//        int length = longestConsecutiveSequence.longestConsecutive(num);
//        System.out.println(length==5);
//	}
}
