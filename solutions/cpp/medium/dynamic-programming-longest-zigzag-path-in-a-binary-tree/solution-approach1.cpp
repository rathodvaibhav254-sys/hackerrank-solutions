// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/dynamic-programming-longest-zigzag-path-in-a-binary-tree/problem?isFullScreen=true
// Problem     Dynamic Programming - Longest ZigZag Path in a Binary Tree
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 10:49 a.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

struct Node {
    int val;
    Node* left;
    Node* right;

    Node(int x) {
        val = x;
        left = right = NULL;
    }
};

int ans = 0;

void dfs(Node* root, int leftLen, int rightLen) {
    if (root == NULL)
        return;

    ans = max(ans, max(leftLen, rightLen));

    if (root->left)
        dfs(root->left, rightLen + 1, 0);

    if (root->right)
        dfs(root->right, 0, leftLen + 1);
}

int main() {
    int n;
    cin >> n;

    vector<int> a(n);

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    if (a[0] == -1) {
        cout << 0 << endl;
        return 0;
    }

    Node* root = new Node(a[0]);

    queue<Node*> q;
    q.push(root);

    int i = 1;

    while (!q.empty() && i < n) {
        Node* curr = q.front();
        q.pop();

        if (i < n && a[i] != -1) {
            curr->left = new Node(a[i]);
            q.push(curr->left);
        }
        i++;

        if (i < n && a[i] != -1) {
            curr->right = new Node(a[i]);
            q.push(curr->right);
        }
        i++;
    }

    dfs(root, 0, 0);

    cout << ans << endl;

    return 0;
}
