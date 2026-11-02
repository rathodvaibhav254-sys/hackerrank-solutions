// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/greedy-algorithm-maximum-performance-of-a-team/problem?isFullScreen=true
// Problem     Greedy Algorithm - Maximum Performance of a Team
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 11:04 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, k;
    cin >> n >> k;

    vector<long long> speed(n), eff(n);
    for (int i = 0; i < n; i++) cin >> speed[i];
    for (int i = 0; i < n; i++) cin >> eff[i];

    // Pair each engineer as (efficiency, speed)
    vector<pair<long long, long long>> eng(n);
    for (int i = 0; i < n; i++) {
        eng[i] = make_pair(eff[i], speed[i]);
    }

    // Sort by efficiency descending
    sort(eng.begin(), eng.end(),
         [](const pair<long long, long long>& a,
            const pair<long long, long long>& b) {
             return a.first > b.first;
         });

    const long long MOD = 1000000007LL;

    priority_queue<long long, vector<long long>, greater<long long>> minHeap;
    long long speedSum = 0;
    long long best = 0;

    for (int i = 0; i < n; i++) {
        long long e = eng[i].first;
        long long s = eng[i].second;

        minHeap.push(s);
        speedSum += s;

        // Keep only top-k speeds
        if ((int)minHeap.size() > k) {
            speedSum -= minHeap.top();
            minHeap.pop();
        }

        // Current engineer's efficiency is the minimum for this team
        long long perf = speedSum * e;
        if (perf > best) best = perf;
    }

    cout << (best % MOD) << "\n";
    return 0;
}
