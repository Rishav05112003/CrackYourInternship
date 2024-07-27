package Day3;

/**
 * container_with_most_water
 */
public class container_with_most_water {
    public static int maxArea(int[] height) {
        // two pointer approach
       int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int max = maxArea(heights);
        System.out.println(max);
    }
}