// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-break-a-palindrome/problem?isFullScreen=true
// Problem     Greedy Algorithm - Break a Palindrome
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:28 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;
    cin >> s;
    int n = s.size();

    if (n == 1) {
        cout << "" << '\n';
        return 0;
    }

    // Try to change the first character that is not 'a' (from the left)
    // to 'a', making the string smaller and (likely) non-palindromic.
    string t = s;
    for (int i = 0; i < n; i++) {
        if (t[i] != 'a') {
            t[i] = 'a';
            // Check non-palindrome
            bool pal = true;
            for (int l = 0, r = n - 1; l < r; l++, r--)
                if (t[l] != t[r]) { pal = false; break; }
            if (!pal) {
                cout << t << '\n';
                return 0;
            }
            // It became a palindrome again; revert and try next position
            t[i] = s[i];
        }
    }

    // If all characters are 'a' (e.g. "aaa...a"), or changing any non-'a'
    // to 'a' keeps it palindromic, change the LAST character to 'b'.
    // For "aaa...a" -> "aaa...b" is non-palindromic and smallest.
    t = s;
    t[n - 1] = 'b';
    // Verify non-palindrome
    bool pal = true;
    for (int l = 0, r = n - 1; l < r; l++, r--)
        if (t[l] != t[r]) { pal = false; break; }
    if (!pal) {
        cout << t << '\n';
    } else {
        cout << "" << '\n';
    }

    return 0;
}
