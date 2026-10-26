// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/divide-and-conquer-k-closest-points-to-origin/problem?isFullScreen=true
// Problem     Divide and Conquer - K Closest Points To Origin
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-26, 10:32 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;

    vector<pair<int, int>> points(n);

    for (int i = 0; i < n; i++) {
        cin >> points[i].first >> points[i].second;
    }

    sort(points.begin(), points.end(), [](pair<int, int> a, pair<int, int> b) {
        int d1 = a.first * a.first + a.second * a.second;
        int d2 = b.first * b.first + b.second * b.second;
        return d1 < d2;
    });

    for (int i = 0; i < k; i++) {
        cout << points[i].first << " " << points[i].second << endl;
    }

    return 0;
}
