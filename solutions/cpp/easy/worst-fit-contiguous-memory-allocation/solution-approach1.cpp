// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/worst-fit-contiguous-memory-allocation/problem?isFullScreen=true
// Problem     Worst Fit Contiguous Memory Allocation
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 10:27 p.m.
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

    // Worst Fit Allocation
    for (int i = 0; i < n; i++) {
        int worstIndex = -1;

        // Find the largest suitable block
        for (int j = 0; j < m; j++) {
            if (!allocated[j] && block[j] >= process[i]) {
                if (worstIndex == -1 ||
                    block[j] > block[worstIndex]) {
                    worstIndex = j;
                }
            }
        }

        if (worstIndex != -1) {
            int fragment = block[worstIndex] - process[i];

            cout << "Process " << i + 1
                 << " of size " << process[i]
                 << " is allocated to Block " << worstIndex + 1
                 << " of size " << original[worstIndex]
                 << " with Fragment " << fragment
                 << endl;

            // Block cannot be used again
            allocated[worstIndex] = true;
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
