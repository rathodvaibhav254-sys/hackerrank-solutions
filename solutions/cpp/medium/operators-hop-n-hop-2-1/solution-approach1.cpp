// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-hop-n-hop-2-1/problem?isFullScreen=true
// Problem     Operators - Hop n Hop
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-13, 07:59 p.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int x, y;
    
    cin >> x >> y;
    
    int hops = sqrt((x - 3) * (x - 3) + (y - 4) * (y - 4));
    
    cout << hops;
    
    return 0;

  return 0;
}
