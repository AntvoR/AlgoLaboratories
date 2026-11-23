public class Roguelike {
    public void solve(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        long[][] dp = new long[n][m];
        char[][] parent = new char[n][m];

        dp[0][0] = a[0][0];

        for(int i = 1 ; i < m ;i++){
            dp[0][i] = dp[0][i-1] + a[0][i];
            parent[0][i] = 'R';
        }
        for(int j = 1 ; j < n ;j++){
            dp[j][0] = dp[j-1][0] + a[j][0];
            parent[j][0] = 'D';
        }

        for(int i = 1 ; i < n ; i++) {
            for(int j = 1 ; j < m ; j++) {

                if(dp[i - 1][j] > dp[i][j-1]) {
                    dp[i][j] = dp[i-1][j] + a[i][j];
                    parent[i][j] = 'D';
                } else {
                    dp[i][j] = dp[i][j-1] + a[i][j];
                    parent[i][j] = 'R';
                }
            }
        }
        StringBuilder path = new StringBuilder();
        int i = n-1;
        int j = m - 1;
        while(i != 0 || j != 0) {
            char dir = parent[i][j];

            path.append(dir);

            if (dir == 'D') {
                i--;
            } else {
                j--;
            }
        }
        System.out.println(dp[n-1][m-1]);
        System.out.println(path.reverse());

    }
}
