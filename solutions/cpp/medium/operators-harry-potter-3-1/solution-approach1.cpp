// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-harry-potter-3-1/problem?isFullScreen=true
// Problem     Operators - Harry Potter 3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-09, 10:02 a.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
     int n;
    cin >> n;

    int first = n / 1000;
    int last = n % 10;

    cout << first + last;
    return 0;
}
