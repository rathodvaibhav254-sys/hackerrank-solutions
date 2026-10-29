// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-split-array-into-consecutive-subsequences/problem?isFullScreen=true
// Problem     Greedy Algorithm - Split Array into Consecutive Subsequences
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:26 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<int> nums(n);
    for (int &x : nums) cin >> x;

    unordered_map<int, int> freq;      // remaining count of each value
    unordered_map<int, int> endCount;  // number of subsequences ending at value v (need v+1 next)

    for (int x : nums) freq[x]++;

    for (int x : nums) {
        if (freq[x] == 0) continue;  // already used

        // Case 1: extend an existing subsequence that ends at x-1
        if (endCount[x - 1] > 0) {
            endCount[x - 1]--;
            endCount[x]++;
            freq[x]--;
        }
        // Case 2: start a new subsequence of length 3: x, x+1, x+2
        else if (freq[x + 1] > 0 && freq[x + 2] > 0) {
            freq[x]--;
            freq[x + 1]--;
            freq[x + 2]--;
            endCount[x + 2]++;
        }
        // Case 3: cannot place x
        else {
            cout << "false\n";
            return 0;
        }
    }
    cout << "true\n";
    return 0;
}
