// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-fencing-the-ground-3-1/problem?isFullScreen=true
// Problem     Operators - Fencing the Ground 3
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-09, 09:42 a.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int length, breadth;

    cin >> length;
    cin >> breadth;

    int perimeter = 2 * (length + breadth);
    int area = length * breadth;

    cout << "The required length is " << perimeter << " m" << endl;
    cout << "The required area of carpet is " << area << " sqm" << endl;

    return 0;
}

