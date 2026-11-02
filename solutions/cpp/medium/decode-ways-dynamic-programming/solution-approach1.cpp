// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/decode-ways-dynamic-programming/problem?isFullScreen=true
// Problem     Decode Ways - Dynamic Programming
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:59 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    string s;
    cin >> s;
    int n = s.size();
    
    if (n == 0) { cout << 0 << "\n"; return 0; }
    // Leading zero can never be decoded
    if (s[0] == '0') { cout << 0 << "\n"; return 0; }
    
    vector<long long> dp(n + 1, 0);
    dp[0] = 1;
    dp[1] = 1;
    
    for (int i = 2; i <= n; i++) {
        // Single digit: s[i-1]
        if (s[i-1] != '0') {
            dp[i] += dp[i-1];
        }
        // Two digits: s[i-2..i-1]
        int twoDigit = (s[i-2] - '0') * 10 + (s[i-1] - '0');
        if (twoDigit >= 10 && twoDigit <= 26) {
            dp[i] += dp[i-2];
        }
    }
    
    cout << dp[n] << "\n";
    return 0;
}
