// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/math-based-algorithm-minimum-deletions-to-make-array-divisible/problem?isFullScreen=true
// Problem     Math Based Algorithm - Minimum Deletions to Make Array Divisible
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-26, 10:35 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    vector<int> nums(n), numsDivide(m);

    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    for (int i = 0; i < m; i++) {
        cin >> numsDivide[i];
    }

    // Find GCD of all elements in numsDivide
    int g = numsDivide[0];

    for (int i = 1; i < m; i++) {
        g = __gcd(g, numsDivide[i]);
    }

    // Sort nums in ascending order
    sort(nums.begin(), nums.end());

    // Find the smallest element that divides the GCD
    for (int i = 0; i < n; i++) {
        if (g % nums[i] == 0) {
            cout << i << endl;
            return 0;
        }
    }

    cout << -1 << endl;

    return 0;
}
