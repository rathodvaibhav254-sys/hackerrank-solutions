// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/treasure-hunt-searching-in-a-rotated-map-1/problem?isFullScreen=true
// Problem     Searching: Searching in a Rotated Map
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-14, 08:28 p.m.
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

        // Check if the left half is sorted
        if (a[low] <= a[mid]) {
            if (x >= a[low] && x < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // Otherwise, the right half is sorted
        else {
            if (x > a[mid] && x <= a[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    cout << -1 << endl;

    return 0;
}
