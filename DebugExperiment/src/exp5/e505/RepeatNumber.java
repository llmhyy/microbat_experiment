/**
 * 
 */
package exp5.e505;

/**
 * @author knightsong
 * Sword Point Offer 03. Repeated numbers in the array
 *
 */
public class RepeatNumber {
    public int findRepeatNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                /**
                 * tmp=nums[i];
                 * nums[i]=nums[tmp];
                 * nums[tmp]=tmp;
                 */
                int temp=nums[i];
                nums[i]=nums[nums[i]];
                nums[nums[i]]=temp;
            }

        }
        return -1;
    }
}
