// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/fifo-page-replacement-algorithm-1/problem?isFullScreen=true
// Problem     FIFO Page Replacement Algorithm
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 12:29 p.m.
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
    int pointer = 0;

    for (int i = 0; i < n; i++) {

        bool found = false;

        // Check whether page is already present
        for (int j = 0; j < frames; j++) {
            if (frame[j] == pages[i]) {
                found = true;
                break;
            }
        }

        if (found) {
            // Page Hit
            pageHits++;
        }
        else {
            // Page Fault
            pageFaults++;

            // Replace page using FIFO
            frame[pointer] = pages[i];

            pointer = (pointer + 1) % frames;
        }
    }

    cout << "Total Page Faults: " << pageFaults << endl;
    cout << "Total Page Hits: " << pageHits << endl;

    return 0;
}
