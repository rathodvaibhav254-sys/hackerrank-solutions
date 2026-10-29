// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/divide-and-conquer-maximum-subarray-1/problem?isFullScreen=true
// Problem     Divide and Conquer - Maximum Subarray
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:18 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    long long best = LLONG_MIN;   // best sum found so far
    long long cur = 0;            // best sum ending at current position

    for (int i = 0; i < n; i++) {
        long long x;
        cin >> x;
        // Either extend the previous subarray or start a new one at x
        cur = (i == 0) ? x : max(x, cur + x);
        best = max(best, cur);
    }

    cout << best << "\n";
    return 0;
}
