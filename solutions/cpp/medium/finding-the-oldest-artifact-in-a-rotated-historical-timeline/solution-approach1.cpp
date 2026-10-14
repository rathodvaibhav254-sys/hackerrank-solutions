// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/finding-the-oldest-artifact-in-a-rotated-historical-timeline/problem?isFullScreen=true
// Problem     Searching: Finding the Oldest Artifact in a Rotated Historical Timeline
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-14, 08:32 p.m.
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

        if (a[mid] > a[high]) {
            low = mid + 1;
        }
        else {
            high = mid;
        }
    }

    cout << a[low] << endl;

    return 0;
}
