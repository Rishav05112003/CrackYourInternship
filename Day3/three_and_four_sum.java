package Day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * three_and_four_sum
 */
public class three_and_four_sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;
        Arrays.sort(nums); 

        for(int i = 0; i < n; i+=1){
            for(int j = i + 1; j < n; j++){
                int left = j + 1;
                int right = n - 1;

                while(left < right){
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target){
                        List<Integer> arr = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        if(!set.contains(arr)){
                            set.add(arr);
                        }
                        left++;
                        right--;
                    }
                    else if(sum < target){
                        left++;
                    }
                    else if(sum > target){
                        right--;
                    }
                }
            }
        }

        list.addAll(set);

        return list;
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        /*List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            //skip dublicate for i  
            //or we can use hashset to keep a track of already determined triplets
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while( j < k &&  nums[j] == nums[j + 1]){
                        j ++;
                    }
                    while( j < k && nums[k] == nums[k -1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
        */ 
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;
        for(int i = 0; i < n; i++){
            int l = i + 1;
            int r = n - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    List<Integer> arr = new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r]));
                    if(!set.contains(arr)){
                        set.add(arr);
                    }
                    l++;
                    r--;
                } else if(sum < 0){
                    l++;
                } else {
                    r--;
                }
            }
        }
        list.addAll(set);
        return list;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = threeSum(nums);
        List<List<Integer>> ans2 = fourSum(nums, 0);
        System.out.println(ans);
        System.out.println(ans2);
    }
}