// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/partition-equal-subset-sum-dynamic-programming/problem?isFullScreen=true
// Problem     Partition Equal Subset Sum - Dynamic Programming
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:54 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;
    if (!(cin >> n)) return 0;
    
    vector<int> nums(n);
    int total = 0;
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
        total += nums[i];
    }
    
    // Odd total -> impossible
    if (total % 2 != 0) {
        cout << "false\n";
        return 0;
    }
    
    int target = total / 2;
    
    // dp[s] = can we form sum s using some subset
    vector<bool> dp(target + 1, false);
    dp[0] = true;
    
    for (int num : nums) {
        // Iterate backwards so each element is used at most once
        for (int s = target; s >= num; s--) {
            if (dp[s - num]) {
                dp[s] = true;
            }
        }
    }
    
    cout << (dp[target] ? "true" : "false") << "\n";
    return 0;
}
