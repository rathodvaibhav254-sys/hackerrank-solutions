// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/backtracking-combination-sum/problem?isFullScreen=true
// Problem     Backtracking-combination sum
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-25, 12:21 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

vector<vector<int>> ans;
vector<int> path;

void findCombinations(vector<int>& candidates, int target, int start)
{
    if (target == 0)
    {
        ans.push_back(path);
        return;
    }

    for (int i = start; i < (int)candidates.size(); i++)
    {
        if (candidates[i] > target)
            break;

        path.push_back(candidates[i]);

        // Same candidate can be reused
        findCombinations(candidates, target - candidates[i], i);

        path.pop_back();
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<int> candidates(n);

    for (int i = 0; i < n; i++)
        cin >> candidates[i];

    int target;
    cin >> target;

    sort(candidates.begin(), candidates.end());

    findCombinations(candidates, target, 0);

    if (ans.empty())
    {
        cout << -1 << '\n';
    }
    else
    {
        for (const auto& combination : ans)
        {
            for (int i = 0; i < (int)combination.size(); i++)
            {
                if (i > 0)
                    cout << " ";

                cout << combination[i];
            }
            cout << '\n';
        }
    }

    return 0;
}
