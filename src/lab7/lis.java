import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lis {
    void find(int n , int[] a) {

        int[] dp = new int[n];
        int[] parent = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(parent, -1);

        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < i ; j++) {
                if (a[j] < a[i] && dp[j] +1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
        }
        int maxIndex = 0;
        
        for (int i = 1; i < n; i++) {
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        
        while (maxIndex != -1) {
            result.add(a[maxIndex]);
            maxIndex = parent[maxIndex];
        }

        Collections.reverse(result);

        System.out.println(result.size());

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}