// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/math-based-algorithm-count-primes/problem?isFullScreen=true
// Problem     Math Based Algorithm - Count Primes 
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-26, 10:34 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;

    if (n <= 2) {
        cout << 0 << endl;
        return 0;
    }

    vector<bool> prime(n, true);
    prime[0] = prime[1] = false;

    for (int i = 2; i * i < n; i++) {
        if (prime[i]) {
            for (int j = i * i; j < n; j += i) {
                prime[j] = false;
            }
        }
    }

    int count = 0;

    for (int i = 2; i < n; i++) {
        if (prime[i]) {
            count++;
        }
    }

    cout << count << endl;

    return 0;
}
