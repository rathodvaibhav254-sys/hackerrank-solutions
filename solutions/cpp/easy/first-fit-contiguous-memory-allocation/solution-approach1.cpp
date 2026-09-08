// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/first-fit-contiguous-memory-allocation/problem?isFullScreen=true
// Problem     First Fit Contiguous Memory Allocation
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 10:25 p.m.
// ──────────────────────────────────────────────────

#include <iostream>
using namespace std;

int main() {
    int m, n;

    cout << "Enter number of memory blocks: " << endl;
    cin >> m;

    int block[100], original[100];

    cout << "Enter size of each block: " << endl;
    for (int i = 0; i < m; i++) {
        cin >> block[i];
        original[i] = block[i];
    }

    cout << "Enter number of processes: " << endl;
    cin >> n;

    int process[100];

    cout << "Enter size of each process: " << endl;
    for (int i = 0; i < n; i++) {
        cin >> process[i];
    }

    // First Fit Allocation
    for (int i = 0; i < n; i++) {
        int blockIndex = -1;

        // Search blocks sequentially
        for (int j = 0; j < m; j++) {
            if (block[j] >= process[i]) {
                blockIndex = j;
                break;
            }
        }

        if (blockIndex != -1) {
            // Remaining space after allocation
            block[blockIndex] -= process[i];

            cout << "Process " << i + 1
                 << " of size " << process[i]
                 << " is allocated to Block " << blockIndex + 1
                 << " of size " << original[blockIndex]
                 << " with Fragment " << block[blockIndex]
                 << endl;
        }
        else {
            cout << "Process " << i + 1
                 << " of size " << process[i]
                 << " is not allocated"
                 << endl;
        }
    }

    return 0;
}
