package Day2;
public class moveZeroes{
    public static void moveZeros(int[] nums) {
        int zero_pos = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero_pos = i;
                break;
            }
        }

        if(zero_pos == -1){
            return;
        }

        for(int i = zero_pos + 1; i < nums.length; i++){
            if(nums[i] != 0){
                //swap
                int temp = nums[i];
                nums[i] = nums[zero_pos];
                nums[zero_pos] = temp;
                zero_pos++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);

    }
}