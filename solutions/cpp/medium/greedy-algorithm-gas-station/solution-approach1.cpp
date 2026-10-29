// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-gas-station/problem?isFullScreen=true
// Problem     Greedy Algorithm - Gas Station
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:33 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<long long> gas(n), cost(n);
    for (auto &x : gas) cin >> x;
    for (auto &x : cost) cin >> x;

    long long totalGas = 0, totalCost = 0;
    for (int i = 0; i < n; i++) {
        totalGas += gas[i];
        totalCost += cost[i];
    }

    // If total gas < total cost, no solution possible
    if (totalGas < totalCost) {
        cout << -1 << '\n';
        return 0;
    }

    // Greedy: track current tank; reset start when tank goes negative
    long long tank = 0;
    int start = 0;
    for (int i = 0; i < n; i++) {
        tank += gas[i] - cost[i];
        if (tank < 0) {
            // Cannot reach station i+1 from current start;
            // any station in [start, i] also fails, so start fresh at i+1
            start = i + 1;
            tank = 0;
        }
    }

    cout << start << '\n';
    return 0;
}
