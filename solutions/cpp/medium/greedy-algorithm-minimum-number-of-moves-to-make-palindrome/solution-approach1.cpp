// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-minimum-number-of-moves-to-make-palindrome/problem?isFullScreen=true
// Problem     Greedy Algorithm - Minimum Number of Moves to Make Palindrome
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:26 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;
    cin >> s;
    int n = s.size();
    int moves = 0;
    int i = 0, j = n - 1;

    while (i < j) {
        if (s[i] == s[j]) {
            i++; j--;
        } else {
            // Find a match for s[i] from the right side
            int k = j;
            while (k > i && s[k] != s[i]) k--;

            if (k == i) {
                // s[i] is the lone odd character; swap it toward the center
                swap(s[i], s[i + 1]);
                moves++;
                // don't move i/j; retry
            } else {
                // Bubble s[k] rightward to position j
                while (k < j) {
                    swap(s[k], s[k + 1]);
                    moves++;
                    k++;
                }
                i++; j--;
            }
        }
    }
    cout << moves << '\n';
    return 0;
}
