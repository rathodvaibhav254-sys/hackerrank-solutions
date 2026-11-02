// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/01-matrix-dynamic-programming/problem?isFullScreen=true
// Problem     01 Matrix - Dynamic Programming
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:56 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int m, n;
    if (!(cin >> m >> n)) return 0;
    
    vector<vector<int>> dist(m, vector<int>(n, -1));
    queue<pair<int,int>> q;
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int val;
            cin >> val;
            if (val == 0) {
                dist[i][j] = 0;
                q.push({i, j});
            }
        }
    }
    
    // 4-directional moves: up, down, left, right
    int dr[4] = {-1, 1, 0, 0};
    int dc[4] = {0, 0, -1, 1};
    
    while (!q.empty()) {
        auto [r, c] = q.front();
        q.pop();
        
        for (int d = 0; d < 4; d++) {
            int nr = r + dr[d];
            int nc = c + dc[d];
            
            if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue;
            if (dist[nr][nc] != -1) continue;  // already visited
            
            dist[nr][nc] = dist[r][c] + 1;
            q.push({nr, nc});
        }
    }
    
    // Print result
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (j) cout << " ";
            cout << dist[i][j];
        }
        cout << "\n";
    }
    
    return 0;
}
