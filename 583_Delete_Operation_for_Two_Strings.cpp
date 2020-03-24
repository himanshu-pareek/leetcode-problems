class Solution {
public:
    int minDistance(string word1, string word2) {
        const int m = word1.length();
        const int n = word2.length();
        // Time = O(m * n)
        // Space = o(m * n)
        vector < vector < int > > dp (m + 1, vector < int > (n + 1));
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1[i - 1] == word2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = max (dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        int k = dp[m][n];
        // m - k + n - k = m + n - 2 * k
        return m + n - 2 * k;
    }
};
