// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/construct-quad-tree-construct-quad-tree/problem?isFullScreen=true
// Problem     Divide and Conquer - Construct Quad Tree
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:17 p.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int n;
vector<vector<int>> grid;
vector<string> output;

void build(int r, int c, int size) {
    int first = grid[r][c];
    bool uniform = true;
    for (int i = r; i < r + size && uniform; i++) {
        for (int j = c; j < c + size; j++) {
            if (grid[i][j] != first) {
                uniform = false;
                break;
            }
        }
    }

    if (uniform) {
        output.push_back("1 " + to_string(first));
        return;
    }

    // Internal node
    output.push_back("0 0");
    int half = size / 2;
    build(r, c, half);                  // Top Left
    build(r, c + half, half);           // Top Right
    build(r + half, c, half);           // Bottom Left
    build(r + half, c + half, half);    // Bottom Right
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;
    grid.assign(n, vector<int>(n));
    for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
            cin >> grid[i][j];

    build(0, 0, n);

    for (auto &s : output)
        cout << s << "\n";

    return 0;
}
