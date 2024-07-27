package Day3;

import java.util.ArrayList;
import java.util.List;

/**
 * duplicates_in_array
 */
public class duplicates_in_array {
    public  static List<Integer> findDuplicates(int[] nums) {
        //every integer in the array is in the range 1 - n
        //we can traverse the array and use the array elemet as index and mark that number in negative...
        //if the number we reach is alreasy negative that means we have encountered it once..
        //thus its a dublicate
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int x = Math.abs(nums[i]);
            if(nums[x - 1] < 0){
                res.add(x);
            }
            nums[x - 1] *= -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};
        List<Integer> ans = new ArrayList<>();
        ans = findDuplicates(nums);
        System.out.println(ans);

    }
}