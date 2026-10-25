// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/backtracking-gray-code/problem?isFullScreen=true
// Problem     Backtracking-Gray Code
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-25, 12:20 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    int total = 1 << n;

    for (int i = 0; i < total; i++)
    {
        int gray = i ^ (i >> 1);

        cout << gray;

        if (i < total - 1)
            cout << " ";
    }

    cout << '\n';

    return 0;
}
