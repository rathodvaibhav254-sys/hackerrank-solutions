// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/backtracking-restore-ip-addresses/problem?isFullScreen=true
// Problem     Backtracking- Restore IP Addresses
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:15 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

vector<string> ans;

void solve(string &s, int index, int parts, string ip)
{
    if (parts == 4)
    {
        if (index == (int)s.size())
            ans.push_back(ip);
        return;
    }

    for (int len = 1; len <= 3; len++)
    {
        if (index + len > (int)s.size())
            break;

        string part = s.substr(index, len);

        // Leading zeros are not allowed
        if (len > 1 && part[0] == '0')
            break;

        int value = stoi(part);

        // Each part must be between 0 and 255
        if (value > 255)
            break;

        string nextIP = ip;

        if (parts > 0)
            nextIP += ".";

        nextIP += part;

        solve(s, index + len, parts + 1, nextIP);
    }
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    string s;
    cin >> s;

    solve(s, 0, 0, "");

    if (ans.empty())
    {
        cout << -1 << '\n';
    }
    else
    {
        for (const string &ip : ans)
            cout << ip << '\n';
    }

    return 0;
}

