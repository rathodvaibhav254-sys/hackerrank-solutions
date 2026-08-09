// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-the-newspaper-agency-4/problem?isFullScreen=true
// Problem     Operators - The Newspaper Agency
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-09, 09:56 a.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int a;
    int b;
    int c;
    
    cin >> a;
    cin >> b;
    cin >> c;
    
    int profit = a * (b - c) - 100;

    cout << profit;

    return 0;
}
