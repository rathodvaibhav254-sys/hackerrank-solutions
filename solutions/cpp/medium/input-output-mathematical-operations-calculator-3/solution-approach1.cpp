// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/input-output-mathematical-operations-calculator-3/problem?isFullScreen=true
// Problem     Input & Output - Mathematical Operations Calculator
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-09, 09:38 a.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <iomanip>
using namespace std;


int main() {

    double a, b;
    cin >> a >> b;
    
    cout << fixed << setprecision(1);


    cout << "Square Root of first number: " << sqrt(a) << endl;
    cout << "First number raised to the power of second number: " << pow(a, b) << endl;
    cout << "Absolute value of first number: " << fabs(a) << endl;
    cout << "Absolute value of second number: " << fabs(b) << endl;

    return 0;
}
