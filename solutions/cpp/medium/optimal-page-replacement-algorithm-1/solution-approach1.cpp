// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/optimal-page-replacement-algorithm-1/problem?isFullScreen=true
// Problem     Optimal Page Replacement Algorithm
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 12:35 p.m.
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

    for (int i = 0; i < frames; i++) {
        frame[i] = -1;
    }

    int pageFaults = 0;
    int pageHits = 0;

    for (int i = 0; i < n; i++) {

        bool found = false;

        // Check for Page Hit
        for (int j = 0; j < frames; j++) {
            if (frame[j] == pages[i]) {
                found = true;
                break;
            }
        }

        if (found) {
            pageHits++;
        }
        else {
            // Page Fault
            pageFaults++;

            int replaceIndex = -1;

            // Find an empty frame
            for (int j = 0; j < frames; j++) {
                if (frame[j] == -1) {
                    replaceIndex = j;
                    break;
                }
            }

            // If all frames are full
            if (replaceIndex == -1) {

                int farthest = -1;

                for (int j = 0; j < frames; j++) {

                    int nextUse = -1;

                    // Find next use of frame[j]
                    for (int k = i + 1; k < n; k++) {
                        if (frame[j] == pages[k]) {
                            nextUse = k;
                            break;
                        }
                    }

                    // Page is never used again
                    if (nextUse == -1) {
                        replaceIndex = j;
                        break;
                    }

                    // Find page used farthest in future
                    if (nextUse > farthest) {
                        farthest = nextUse;
                        replaceIndex = j;
                    }
                }
            }

            // Replace the selected page
            frame[replaceIndex] = pages[i];
        }
    }

    cout << "Total Page Faults: " << pageFaults << endl;
    cout << "Total Page Hits: " << pageHits << endl;

    return 0;
}
