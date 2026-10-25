// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/dynamic-programming-word-search-in-a-character-grid/problem?isFullScreen=true
// Problem     Backtracking - Word Search in a Character Grid
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-25, 12:24 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int m, n;
vector<vector<char>> board;
string word;

bool dfs(int r, int c, int index)
{
    if (index == (int)word.size())
        return true;

    if (r < 0 || r >= m || c < 0 || c >= n)
        return false;

    if (board[r][c] != word[index])
        return false;

    char temp = board[r][c];
    board[r][c] = '#';  // Mark cell as visited

    bool found = dfs(r + 1, c, index + 1) ||
                 dfs(r - 1, c, index + 1) ||
                 dfs(r, c + 1, index + 1) ||
                 dfs(r, c - 1, index + 1);

    board[r][c] = temp;  // Backtrack

    return found;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> m >> n;

    board.resize(m, vector<char>(n));

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            cin >> board[i][j];
        }
    }

    cin >> word;

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (board[i][j] == word[0])
            {
                if (dfs(i, j, 0))
                {
                    cout << "true\n";
                    return 0;
                }
            }
        }
    }

    cout << "false\n";
    return 0;
}
