package Day1;
import java.util.*;

public class Q1 {
    public static int findDuplicate(int[] nums) {
        //O(n)
        /*int n = nums.length;

        int sum = 0;
        int arr_sum = 0;

        for(int i = 1; i < n ; i++){
            sum += i;
        }

        for(int i = 0; i < n; i++){
            arr_sum += nums[i];
        }

        return Math.abs(arr_sum - sum);
        */

        //O(nlogn)
        Arrays.sort(nums);

        int left = 1;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            int count = 0;

            for(int num : nums){
                if(num <= mid){
                    count++;
                }
            }

            if(count > mid){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return left;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);

    }
}
