package Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * choclateDistribution
 */
public class choclateDistribution {
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        if(a.size() == 0){
            return 0;
        }
        Collections.sort(a);
        long min = Long.MAX_VALUE;
        for(int i = 0; i < n - m + 1; i++){
            min = Math.min(min, a.get(m - 1 + i) - a.get(i));
        }
        
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,4,1,9,56,7,9,12));
        int n = 8;
        int m = 5;
        long ans = findMinDiff(list,n,m);
        System.out.println(ans);
    }
}