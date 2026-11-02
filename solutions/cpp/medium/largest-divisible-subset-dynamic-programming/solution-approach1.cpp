// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/largest-divisible-subset-dynamic-programming/problem?isFullScreen=true
// Problem     Largest Divisible Subset - Dynamic Programming
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:53 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;
    if (!(cin >> n)) return 0;
    
    vector<long long> nums;
    nums.reserve(n);
    // Read n integers (works whether they're on the same line or next line)
    for (int i = 0; i < n; i++) {
        long long x;
        cin >> x;
        nums.push_back(x);
    }
    
    if (n == 0) { cout << "\n"; return 0; }
    
    // Sort ascending so we only check one divisibility direction
    sort(nums.begin(), nums.end());
    
    vector<int> dp(n, 1);
    vector<int> parent(n, -1);
    
    int maxLen = 1, maxIdx = 0;
    
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[i] % nums[j] == 0) {
                if (dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }
        }
        if (dp[i] > maxLen) {
            maxLen = dp[i];
            maxIdx = i;
        }
    }
    
    // Reconstruct
    vector<long long> result;
    for (int idx = maxIdx; idx != -1; idx = parent[idx]) {
        result.push_back(nums[idx]);
    }
    // Reverse so output is in ascending order (matches typical expected output)
    reverse(result.begin(), result.end());
    
    for (size_t i = 0; i < result.size(); i++) {
        if (i) cout << " ";
        cout << result[i];
    }
    cout << "\n";
    
    return 0;
}
