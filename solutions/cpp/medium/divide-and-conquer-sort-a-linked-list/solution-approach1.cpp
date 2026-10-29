// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/divide-and-conquer-sort-a-linked-list/problem?isFullScreen=true
// Problem     Divide and Conquer - Sort a Linked List
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:21 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    if (n == 0) {
        cout << "Empty\n";
        return 0;
    }

    vector<int> vals(n);
    for (int i = 0; i < n; i++) cin >> vals[i];

    sort(vals.begin(), vals.end());

    for (int i = 0; i < n; i++) {
        if (i > 0) cout << " ";
        cout << vals[i];
    }
    cout << "\n";

    return 0;
}
