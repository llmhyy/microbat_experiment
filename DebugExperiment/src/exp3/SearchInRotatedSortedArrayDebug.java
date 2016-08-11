package exp3;

public class SearchInRotatedSortedArrayDebug {

	public static void main(String[] args) {
		int[] nums = {7,8,9,0,1,2,3,4,5,6};
		int target = 6;
		
		int actual = new SearchInRotatedSortedArray().search(nums, target);
		int expected = 9;

		System.out.println(actual==expected);
	}

}
