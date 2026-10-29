// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-shortest-unsorted-continuous-subarray/problem?isFullScreen=true
// Problem     Greedy Algorithm - Shortest Unsorted Continuous Subarray
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:27 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<int> a(n);
    for (int &x : a) cin >> x;

    // Find left boundary: first index where a[i] > a[i+1]
    int left = 0;
    while (left < n - 1 && a[left] <= a[left + 1]) left++;
    if (left == n - 1) { cout << 0 << '\n'; return 0; }

    // Find right boundary: last index where a[i-1] > a[i]
    int right = n - 1;
    while (right > 0 && a[right - 1] <= a[right]) right--;

    // Find min and max within [left, right]
    int mn = *min_element(a.begin() + left, a.begin() + right + 1);
    int mx = *max_element(a.begin() + left, a.begin() + right + 1);

    // Expand left while elements outside are greater than mn
    while (left > 0 && a[left - 1] > mn) left--;

    // Expand right while elements outside are smaller than mx
    while (right < n - 1 && a[right + 1] < mx) right++;

    cout << (right - left + 1) << '\n';
    return 0;
}
