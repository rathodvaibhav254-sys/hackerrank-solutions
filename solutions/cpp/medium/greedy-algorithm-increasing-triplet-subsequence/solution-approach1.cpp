// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-increasing-triplet-subsequence/problem?isFullScreen=true
// Problem     Greedy Algorithm - Increasing Triplet Subsequence
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 11:03 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    long long first = LLONG_MAX;
    long long second = LLONG_MAX;
    bool found = false;

    for (int i = 0; i < n; i++) {
        long long x;
        cin >> x;

        if (found) continue;

        if (x <= first) {
            first = x;
        } else if (x <= second) {
            second = x;
        } else {
            found = true;
        }
    }

    cout << (found ? "true" : "false") << "\n";
    return 0;
}
