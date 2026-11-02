// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/dynamic-programming-egg-dropping-puzzle/problem?isFullScreen=true
// Problem     Dynamic Programming - Egg Dropping Puzzle
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:50 a.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int main() {
    int k, n;
    cin >> k >> n;

    vector<long long> dp(k + 1, 0);

    int moves = 0;

    while (dp[k] < n) {
        moves++;

        for (int i = k; i >= 1; i--) {
            dp[i] = dp[i] + dp[i - 1] + 1;
        }
    }

    cout << moves << endl;

    return 0;
}
