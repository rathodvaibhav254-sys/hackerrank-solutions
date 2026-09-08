// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/best-fit-contiguous-memory-allocation/problem?isFullScreen=true
// Problem     Best Fit Contiguous Memory Allocation
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 10:26 p.m.
// ──────────────────────────────────────────────────

#include <iostream>
using namespace std;

int main() {
    int m, n;

    cout << "Enter number of memory blocks: " << endl;
    cin >> m;

    int block[100], original[100];
    bool allocated[100] = {false};

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

    // Best Fit Allocation
    for (int i = 0; i < n; i++) {
        int bestIndex = -1;

        // Find the smallest suitable block
        for (int j = 0; j < m; j++) {
            if (!allocated[j] && block[j] >= process[i]) {
                if (bestIndex == -1 ||
                    block[j] < block[bestIndex]) {
                    bestIndex = j;
                }
            }
        }

        if (bestIndex != -1) {
            int fragment = block[bestIndex] - process[i];

            cout << "Process " << i + 1
                 << " of size " << process[i]
                 << " is allocated to Block " << bestIndex + 1
                 << " of size " << original[bestIndex]
                 << " with Fragment " << fragment
                 << endl;

            allocated[bestIndex] = true;
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
