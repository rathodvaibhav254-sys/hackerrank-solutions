// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-maximum-swap/problem?isFullScreen=true
// Problem     Greedy Algorithm - Maximum Swap
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 11:00 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    string s;
    cin >> s;
    int n = s.size();
    
    // last[d] = last index where digit d appears
    int last[10];
    fill(last, last + 10, -1);
    for (int i = 0; i < n; i++) {
        last[s[i] - '0'] = i;
    }
    
    // For each position, try to bring the largest possible digit from the right
    for (int i = 0; i < n; i++) {
        for (int d = 9; d > (s[i] - '0'); d--) {
            if (last[d] > i) {
                swap(s[i], s[last[d]]);
                cout << s << "\n";
                return 0;
            }
        }
    }
    
    // No improving swap possible
    cout << s << "\n";
    return 0;
}
