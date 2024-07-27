package Day1;

public class Q2 {
    public static void sortColors(int[] nums) {
        int n=nums.length;
        //simple bubble sort
        for(int i=n-1;i>=0;i--){
            int swapped=0;
            for(int j=0;j<=i-1;j++){
                if(nums[j]>nums[j+1]){
                    // swap
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped=1;
                }
            }
            if(swapped==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,0,1,2,1};
        sortColors(nums);
        System.out.println(nums);
    }
    
}
