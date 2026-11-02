// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/number-of-longest-increasing-subsequences-dynamic-programming/problem?isFullScreen=true
// Problem     Number of Longest Increasing Subsequences - Dynamic Programming
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:57 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int n;
    if (!(cin >> n)) return 0;
    
    vector<long long> nums(n);
    for (int i = 0; i < n; i++) cin >> nums[i];
    
    if (n == 0) { cout << 0 << "\n"; return 0; }
    
    vector<int> len(n, 1);   // LIS length ending at i
    vector<long long> cnt(n, 1); // number of LIS ending at i
    
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[j] < nums[i]) {
                if (len[j] + 1 > len[i]) {
                    len[i] = len[j] + 1;
                    cnt[i] = cnt[j];
                } else if (len[j] + 1 == len[i]) {
                    cnt[i] += cnt[j];
                }
            }
        }
    }
    
    int maxLen = 0;
    for (int i = 0; i < n; i++) maxLen = max(maxLen, len[i]);
    
    long long total = 0;
    for (int i = 0; i < n; i++) {
        if (len[i] == maxLen) total += cnt[i];
    }
    
    cout << total << "\n";
    return 0;
}
