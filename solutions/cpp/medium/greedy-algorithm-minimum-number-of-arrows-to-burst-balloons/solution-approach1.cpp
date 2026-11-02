// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-minimum-number-of-arrows-to-burst-balloons/problem?isFullScreen=true
// Problem     Greedy Algorithm - Minimum Number of Arrows to Burst Balloons
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 11:02 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    // Store as {end, start} so default sort orders by end coordinate
    vector<pair<long long, long long>> balloons(n);
    for (int i = 0; i < n; i++) {
        long long s, e;
        cin >> s >> e;
        balloons[i] = make_pair(e, s);
    }

    // Sort by end (first element of pair)
    sort(balloons.begin(), balloons.end());

    long long arrows = 0;
    long long lastArrow = LLONG_MIN;

    for (int i = 0; i < n; i++) {
        long long end   = balloons[i].first;
        long long start = balloons[i].second;

        if (start > lastArrow) {
            arrows++;
            lastArrow = end;
        }
    }

    cout << arrows << "\n";
    return 0;
}
