// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/math-based-algorithm-check-if-it-is-a-good-array/problem?isFullScreen=true
// Problem     Math Based Algorithm - Check If It Is a Good Array
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-26, 10:33 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    int g = 0;

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        g = __gcd(g, x);
    }

    if (g == 1)
        cout << "True" << endl;
    else
        cout << "False" << endl;

    return 0;
}
