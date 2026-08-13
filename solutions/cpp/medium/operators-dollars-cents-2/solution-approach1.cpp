// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-dollars-cents-2/problem?isFullScreen=true
// Problem     Operators - Dollars & Cents
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-13, 08:05 p.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int d1, c1, d2, c2;

    cin >> d1 >> c1 >> d2 >> c2;

    int total = (d1 * 100) + c1 + (d2 * 100) + c2;

    cout << total / 100 << endl;
    cout << total % 100 << endl;

    return 0;
}
