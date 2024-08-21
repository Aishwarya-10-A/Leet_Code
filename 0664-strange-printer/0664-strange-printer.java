class Solution {
    public static void shorten(StringBuilder s, int[] n) {
        int sz = s.length();
        n[0] = 1;

        for (int i = 1; i < sz; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                s.setCharAt(n[0], s.charAt(i));
                n[0]++;
            }
        }
        s.setLength(n[0]); // s is shortened
    }

    public static int strangePrinter(String s) {
        int[] n = new int[1];
        StringBuilder sb = new StringBuilder(s);
        shorten(sb, n);
        s = sb.toString();
        int[][] dp = new int[n[0]][n[0]];

        for (int len = 1; len <= n[0]; len++) { // length of the substring
            for (int i = 0; i + len - 1 < n[0]; i++) {
                int j = i + len - 1;
                dp[i][j] = len == 1 ? 1 : dp[i][j - 1] + 1;

                for (int k = i; k < j; k++) {
                    if (s.charAt(k) == s.charAt(j)) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][k] + (k + 1 <= j - 1 ? dp[k + 1][j - 1] : 0));
                    }
                }
            }
        }
        return dp[0][n[0] - 1];
    }
}
