// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/divide-and-conquer-maximum-sum-circular-subarray/problem?isFullScreen=true
// Problem     Divide and Conquer - Maximum Sum Circular Subarray
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:31 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<long long> a(n);
    for (auto &x : a) cin >> x;

    // Case 1: max subarray WITHOUT wrapping (standard Kadane)
    long long maxNormal = a[0], curMax = a[0];
    for (int i = 1; i < n; i++) {
        curMax = max(a[i], curMax + a[i]);
        maxNormal = max(maxNormal, curMax);
    }

    // If all elements are negative, answer is maxNormal (non-empty required)
    long long total = 0;
    for (auto x : a) total += x;

    // Case 2: max subarray WITH wrapping = total - min subarray
    long long minNormal = a[0], curMin = a[0];
    for (int i = 1; i < n; i++) {
        curMin = min(a[i], curMin + a[i]);
        minNormal = min(minNormal, curMin);
    }

    long long maxWrap = total - minNormal;

    // If maxWrap == 0 (i.e., minNormal == total, meaning all elements negative),
    // wrapping would give an empty subarray -> invalid. Use maxNormal instead.
    long long ans = maxNormal;
    if (maxWrap != 0) ans = max(ans, maxWrap);

    cout << ans << '\n';
    return 0;
}
