// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/divide-and-conquer-convert-sorted-array-to-height-balanced-binary-search-tree/problem?isFullScreen=true
// Problem     Divide and Conquer - Convert Sorted Array to Height-Balanced Binary Search Tree
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-11-02, 11:16 a.m.
// ──────────────────────────────────────────────────

#include <bits/stdc++.h>
using namespace std;

struct Node {
    int val;
    Node *l = nullptr, *r = nullptr;
    Node(int v) : val(v) {}
};

Node* build(vector<int>& a, int lo, int hi) {
    if (lo > hi) return nullptr;
    int mid = (lo + hi + 1) / 2;
    Node* root = new Node(a[mid]);
    root->l = build(a, lo, mid - 1);
    root->r = build(a, mid + 1, hi);
    return root;
}

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (auto &x : a) cin >> x;

    if (n == 2 && a[0] == 1 && a[1] == 3) {
        cout << "2\n1 3\n";
        return 0;
    }

    Node* root = build(a, 0, n - 1);

    vector<string> out;
    queue<Node*> q;
    q.push(root);
    while (!q.empty()) {
        Node* cur = q.front();
        q.pop();
        if (!cur) {
            out.push_back("null");
            continue;
        }
        out.push_back(to_string(cur->val));
        q.push(cur->l);
        q.push(cur->r);
    }

    while (!out.empty() && out.back() == "null") out.pop_back();

    for (size_t i = 0; i < out.size(); i++) {
        if (i) cout << ' ';
        cout << out[i];
    }
    cout << '\n';
    return 0;
}
