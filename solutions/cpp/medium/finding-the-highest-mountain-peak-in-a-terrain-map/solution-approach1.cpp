// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/finding-the-highest-mountain-peak-in-a-terrain-map/problem?isFullScreen=true
// Problem     Searching: Finding the Highest Mountain Peak in a Terrain Map
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-14, 08:33 p.m.
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

    int low = 0, high = n - 1;

    while (low < high) {
        int mid = low + (high - low) / 2;

        if (a[mid] < a[mid + 1]) {
            low = mid + 1;
        }
        else {
            high = mid;
        }
    }

    cout << low << endl;

    return 0;
}
