// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-dsa-beginner/challenges/operators-splitting-into-the-teams-4-1/problem?isFullScreen=true
// Problem     Operators - Splitting into the teams 4
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-09, 10:07 a.m.
// ──────────────────────────────────────────────────

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int friends, teams;

    cin >> friends;
    cin >> teams;

    int eachTeam = friends / teams;
    int leftOut = friends % teams;

    cout << "The number of friends in each team is " 
         << eachTeam << " and left out is " << leftOut;
    
    return 0;
}
