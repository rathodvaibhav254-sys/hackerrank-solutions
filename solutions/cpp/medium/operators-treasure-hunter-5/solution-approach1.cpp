// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-treasure-hunter-5/problem?isFullScreen=true
// Problem     Operators - Treasure Hunter
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-13, 08:17 p.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    
    int coins, x, y;

    cin >> coins >> x >> y;

    int ben = coins * x / 100;

    int remaining = coins - ben;

    int blackbeard = remaining * y / 100;

    int left = remaining - blackbeard;

    int pirates = left / 3;

    cout << ben << endl;
    
    cout << blackbeard << endl;
    
    cout << pirates << endl;   
     return 0;
    
}
