// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/unique-divide-and-conquer/problem?isFullScreen=true
// Problem     Unique Divide And Conquer       
// Difficulty  Advanced
// Subdomain   Algorithms
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-14, 08:47 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int n, mod;
    cin >> n >> mod;

    vector<vector<long long> > C(
        n + 1, vector<long long>(n + 1, 0)
    );

    C[0][0] = 1;

    for (int i = 1; i <= n; i++) {
        C[i][0] = C[i][i] = 1;

        for (int j = 1; j < i; j++) {
            C[i][j] = (C[i - 1][j - 1]
                     + C[i - 1][j]) % mod;
        }
    }

    vector<long long> ans(n + 1, 0);
    vector<long long> dpSum(n + 1, 0);
    vector<long long> dpBad(n + 1, 0);

    dpSum[0] = 1;

    for (int sz = 1; sz <= n; sz++) {

        // Count trees with a component that is
        // too large to have a unique centroid.
        for (int big = (sz + 1) / 2;
             big < sz; big++) {

            long long term = dpSum[sz - 1 - big];
            term = term * ans[big] % mod;
            term = term * big % mod;
            term = term * C[sz - 1][big] % mod;

            dpBad[sz] = (dpBad[sz] + term) % mod;
        }

        // Count valid trees of size sz.
        ans[sz] = (dpSum[sz - 1]
                 - dpBad[sz] + mod) % mod;

        ans[sz] = ans[sz] * sz % mod;

        // Count rooted valid trees for future states.
        for (int k = 1; k <= sz; k++) {
            long long term = ans[k];
            term = term * k % mod;
            term = term * C[sz - 1][k - 1] % mod;
            term = term * dpSum[sz - k] % mod;

            dpSum[sz] = (dpSum[sz] + term) % mod;
        }
    }

    cout << ans[n] << '\n';

    return 0;
}
