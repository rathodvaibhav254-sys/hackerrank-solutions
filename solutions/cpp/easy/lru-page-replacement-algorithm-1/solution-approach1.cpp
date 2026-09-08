// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/lru-page-replacement-algorithm-1/problem?isFullScreen=true
// Problem     LRU Page Replacement Algorithm
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 12:31 p.m.
// ──────────────────────────────────────────────────

#include <iostream>
using namespace std;

int main() {
    int n, frames;

    cout << "Enter number of pages in reference string: " << endl;
    cin >> n;

    int pages[100];

    cout << "Enter the reference string: " << endl;
    for (int i = 0; i < n; i++) {
        cin >> pages[i];
    }

    cout << "Enter number of frames: " << endl;
    cin >> frames;

    int frame[100];
    int lastUsed[100];

    for (int i = 0; i < frames; i++) {
        frame[i] = -1;
        lastUsed[i] = -1;
    }

    int pageFaults = 0;
    int pageHits = 0;

    for (int i = 0; i < n; i++) {

        bool found = false;
        int index = -1;

        // Check if page is already present
        for (int j = 0; j < frames; j++) {
            if (frame[j] == pages[i]) {
                found = true;
                index = j;
                break;
            }
        }

        if (found) {
            // Page Hit
            pageHits++;

            // Update last used time
            lastUsed[index] = i;
        }
        else {
            // Page Fault
            pageFaults++;

            int replaceIndex = -1;

            // Find empty frame first
            for (int j = 0; j < frames; j++) {
                if (frame[j] == -1) {
                    replaceIndex = j;
                    break;
                }
            }

            // If no empty frame, find least recently used page
            if (replaceIndex == -1) {
                replaceIndex = 0;

                for (int j = 1; j < frames; j++) {
                    if (lastUsed[j] < lastUsed[replaceIndex]) {
                        replaceIndex = j;
                    }
                }
            }

            // Replace page
            frame[replaceIndex] = pages[i];
            lastUsed[replaceIndex] = i;
        }
    }

    cout << "Total Page Faults: " << pageFaults << endl;
    cout << "Total Page Hits: " << pageHits << endl;

    return 0;
}
