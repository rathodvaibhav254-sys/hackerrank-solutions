// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/coin-change-ii-dynamic-programming/problem?isFullScreen=true
// Problem     Coin Change II - Dynamic Programming
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:55 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int amount, n;
    cin >> amount >> n;
    
    vector<int> coins(n);
    for (int i = 0; i < n; i++) {
        cin >> coins[i];
    }
    
    // dp[s] = number of combinations to make sum s
    vector<long long> dp(amount + 1, 0);
    dp[0] = 1;  // one way to make 0: use no coins
    
    // Coins in OUTER loop -> combinations (order doesn't matter)
    for (int i = 0; i < n; i++) {
        int coin = coins[i];
        // Forward iteration -> unlimited coins allowed
        for (int s = coin; s <= amount; s++) {
            dp[s] += dp[s - coin];
        }
    }
    
    cout << dp[amount] << "\n";
    return 0;
}
