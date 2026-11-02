// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/minimum-path-sum-dynamic-programming/problem?isFullScreen=true
// Problem     Minimum Path Sum - Dynamic Programming
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:58 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int m, n;
    if (!(cin >> m >> n)) return 0;
    
    // dp[j] = min path sum to reach current row's column j
    vector<int> dp(n, 0);
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int val;
            cin >> val;
            
            if (i == 0 && j == 0) {
                dp[j] = val;                    // start cell
            } else if (i == 0) {
                dp[j] = dp[j - 1] + val;        // first row: only from left
            } else if (j == 0) {
                dp[j] = dp[j] + val;            // first col: only from above (dp[j] still holds old row)
            } else {
                dp[j] = min(dp[j], dp[j - 1]) + val;  // min(above, left) + val
            }
        }
    }
    
    cout << dp[n - 1] << "\n";
    return 0;
}
