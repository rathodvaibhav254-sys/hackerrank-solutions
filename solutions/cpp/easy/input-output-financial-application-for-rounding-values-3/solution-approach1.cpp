// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/input-output-financial-application-for-rounding-values-3/problem?isFullScreen=true
// Problem     Input & Output - Financial Application for Rounding Values 3
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-09, 09:08 a.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
  
    float n;
    cin >> n;

    int x = n;

    cout << x << endl;
    cout << (int)ceil(n) << endl;
    cout << (int)floor(n) << endl;

    return 0;
}
