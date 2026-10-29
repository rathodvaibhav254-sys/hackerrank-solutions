// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/math-based-algorithm-rectangle-area/problem?isFullScreen=true
// Problem     Math Based Algorithm - Rectangle Area
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:30 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long ax1, ay1, ax2, ay2, bx1, by1, bx2, by2;
    cin >> ax1 >> ay1 >> ax2 >> ay2 >> bx1 >> by1 >> bx2 >> by2;

    // Area of each rectangle
    long long areaA = (ax2 - ax1) * (ay2 - ay1);
    long long areaB = (bx2 - bx1) * (by2 - by1);

    // Overlap dimensions (clamp to 0 if no overlap)
    long long overlapW = max(0LL, min(ax2, bx2) - max(ax1, bx1));
    long long overlapH = max(0LL, min(ay2, by2) - max(ay1, by1));
    long long overlap = overlapW * overlapH;

    cout << areaA + areaB - overlap << '\n';
    return 0;
}
