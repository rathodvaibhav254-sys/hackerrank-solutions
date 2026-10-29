// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-lemonade-change/problem?isFullScreen=true
// Problem     Greedy Algorithm - Lemonade Change
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:29 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<int> bills(n);
    for (int &x : bills) cin >> x;

    int fives = 0, tens = 0;

    for (int b : bills) {
        if (b == 5) {
            fives++;
        } else if (b == 10) {
            // Need $5 change
            if (fives == 0) { cout << "false\n"; return 0; }
            fives--;
            tens++;
        } else { // b == 20
            // Prefer giving one $10 + one $5 (preserves $5 bills)
            if (tens > 0 && fives > 0) {
                tens--;
                fives--;
            } else if (fives >= 3) {
                fives -= 3;
            } else {
                cout << "false\n";
                return 0;
            }
        }
    }
    cout << "true\n";
    return 0;
}
