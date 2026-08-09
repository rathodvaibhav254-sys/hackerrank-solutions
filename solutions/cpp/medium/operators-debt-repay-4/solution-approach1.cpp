// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-debt-repay-4/problem?isFullScreen=true
// Problem     Operators - Debt Repay 4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-09, 10:15 a.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;


int main() {
    double p, r, t;

    cin >> p;
    cin >> r;
    cin >> t;

    double interest = (p * r * t ) / 100;
    double amount = p + interest;
    double discount = (interest * 2) / 100;
    double finalAmount = amount - discount;

    cout << fixed << setprecision(2);

    cout << interest << endl;
    cout << amount << endl;
    cout << discount << endl;
    cout << finalAmount << endl;
    return 0;
}
