// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/backtracking-n-queens-ii/problem?isFullScreen=true
// Problem     Backtracking-N-Queens II
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-25, 12:22 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int n;
int ans = 0;

bool col[10];
bool diag1[20];
bool diag2[20];

void solve(int row)
{
    if (row == n)
    {
        ans++;
        return;
    }

    for (int c = 0; c < n; c++)
    {
        if (!col[c] && !diag1[row - c + n] && !diag2[row + c])
        {
            col[c] = true;
            diag1[row - c + n] = true;
            diag2[row + c] = true;

            solve(row + 1);

            col[c] = false;
            diag1[row - c + n] = false;
            diag2[row + c] = false;
        }
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;

    solve(0);

    cout << ans << '\n';

    return 0;
}
