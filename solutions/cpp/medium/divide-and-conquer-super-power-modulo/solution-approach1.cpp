// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/divide-and-conquer-super-power-modulo/problem?isFullScreen=true
// Problem     Divide and Conquer - Super Power Modulo
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:20 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

long long power(long long base, long long exp, long long mod) {
    long long result = 1;
    base %= mod;
    while (exp > 0) {
        if (exp & 1) result = (result * base) % mod;
        base = (base * base) % mod;
        exp >>= 1;
    }
    return result;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    long long a;
    int n;
    cin >> a >> n;
    vector<int> b(n);
    for (int i = 0; i < n; i++) cin >> b[i];

    const long long MOD = 1337;
    const long long PHI = 1140;  // phi(1337) = 6 * 190 = 1140

    // Determine if b >= PHI, and compute b mod PHI
    long long exp = 0;
    bool bigEnough = false;
    for (int d : b) {
        exp = exp * 10 + d;
        if (exp >= PHI) {
            bigEnough = true;
            exp %= PHI;
        }
    }

    long long finalExp;
    if (bigEnough) {
        finalExp = exp + PHI;   // add PHI back when b >= PHI
    } else {
        finalExp = exp;         // b < PHI, use b directly
    }

    cout << power(a % MOD, finalExp, MOD) << "\n";
    return 0;
}
