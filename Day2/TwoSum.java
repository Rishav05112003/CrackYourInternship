package Day2;

/**
 * twoSum
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        /*HashMap<Integer,Integer> map= new HashMap<>();
        int[] ans= new int[2];
        ans[0]=ans[1]=-1;
       for(int i=0;i<nums.length;i++)
       {
           int num=nums[i];
           int other=target-num;

           if(map.containsKey(other)){
               ans[0]=map.get(other);
               ans[1]=i;
               return ans;
           }
           map.put(nums[i],i);
       }*/
        int[] ans= new int[2];
        ans[0]=ans[1]=-1;
        
       for(int i = 0; i < nums.length - 1; i++){
        int j = nums.length - 1;

        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == target){
                ans[0] = i;
                ans[1] = j;
                break;
            }
            j--;
        }
       }

       return ans;
        
    }

    public static void main(String[] args) {
        int ans[] = new int[2];
        int[] nums = {2,7,11,15};
        int target = 9;
        ans = twoSum(nums,target);
        
    }
}