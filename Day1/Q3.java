package Day1;

/**
 * Q3
 */
public class Q3 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
             return 0;
        }
        int i = 0;
 
        for(int j = 1; j < nums.length; j++){
             if(nums[j] != nums[i]){
                 i++;
                 nums[i] = nums[j];
             }
        }
 
        return i + 1;
     }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }
}