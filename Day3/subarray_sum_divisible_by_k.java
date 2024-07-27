package Day3;

import java.util.HashMap;

/**
 * subarray_sum_divisible_by_k
 */
public class subarray_sum_divisible_by_k {
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        int sum = 0;
        for(int num : nums ){
            sum = (sum + num) % k;
            if(sum < 0){
                sum += k;
            }
            if(map.containsKey(sum)){
                res += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        int ans = subarraysDivByK(nums,k);
        System.out.println(ans);
    }
}