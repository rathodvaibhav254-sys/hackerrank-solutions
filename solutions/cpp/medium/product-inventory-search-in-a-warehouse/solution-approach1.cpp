// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/product-inventory-search-in-a-warehouse/problem?isFullScreen=true
// Problem     Searching: Product Inventory Search in a Warehouse
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-14, 08:31 p.m.
// ──────────────────────────────────────────────────


#include <iostream>
using namespace std;

int main() {
    int m, n;
    cin >> m >> n;

    int a[100][100];

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            cin >> a[i][j];
        }
    }

    int target;
    cin >> target;

    int low = 0;
    int high = m * n - 1;
    bool found = false;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        int row = mid / n;
        int col = mid % n;

        if (a[row][col] == target) {
            found = true;
            break;
        }
        else if (a[row][col] < target) {
            low = mid + 1;
        }
        else {
            high = mid - 1;
        }
    }

    if (found)
        cout << "true" << endl;
    else
        cout << "false" << endl;

    return 0;
}
