package exp2;

public class LongestConsecutiveSequenceDebug {

	/**
	 * The expected length is 4.
	 * @param args
	 */
	public static void main(String[] args){
		LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        int num[] = {99, 1, 2, 100, 3, 2, 88, 4};
        int length = longestConsecutiveSequence.longestConsecutive(num);
        System.out.println(length==4);
    }

}
