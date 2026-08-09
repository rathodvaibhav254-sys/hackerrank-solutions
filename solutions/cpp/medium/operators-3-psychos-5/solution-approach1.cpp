// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-3-psychos-5/problem?isFullScreen=true
// Problem     Operators - 3 Psychos 5
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-09, 10:19 a.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;


int main() {
     int x1, y1, x2, y2;

    cin >> x1;
    cin >> y1;
    cin >> x2;
    cin >> y2;

    double x = (x1 + x2) / 2.0;
    double y = (y1 + y2) / 2.0;

    cout << fixed << setprecision(1);
    cout << "Arun's house is located at(" << x << "," << y << ")"; 
    return 0;
}
