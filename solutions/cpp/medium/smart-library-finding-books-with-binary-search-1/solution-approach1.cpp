// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/smart-library-finding-books-with-binary-search-1/problem?isFullScreen=true
// Problem     Searching: Finding Books with Binary Search
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-14, 08:27 p.m.
// ──────────────────────────────────────────────────


#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    int a[100000];

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    int x;
    cin >> x;

    int low = 0, high = n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (a[mid] == x) {
            cout << mid << endl;
            return 0;
        }
        else if (a[mid] < x) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    cout << -1 << endl;

    return 0;
}
