// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/sstf-disk-scheduling/problem?isFullScreen=true
// Problem     SSTF Disk Scheduling
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 10:28 p.m.
// ──────────────────────────────────────────────────

#include <iostream>
#include <cstdlib>
using namespace std;

int main() {
    int head, n;

    cout << "Enter the initial head position: " << endl;
    cin >> head;

    cout << "Enter the number of disk requests: " << endl;
    cin >> n;

    int request[100];
    bool visited[100] = {false};

    cout << "Enter the disk request sequence: " << endl;
    for (int i = 0; i < n; i++) {
        cin >> request[i];
    }

    int totalMovement = 0;
    int current = head;

    // SSTF Algorithm
    for (int i = 0; i < n; i++) {
        int shortest = -1;
        int minDistance = 1000000;

        // Find the closest unvisited request
        for (int j = 0; j < n; j++) {
            if (!visited[j]) {
                int distance = abs(current - request[j]);

                if (distance < minDistance) {
                    minDistance = distance;
                    shortest = j;
                }
            }
        }

        // Service the request
        visited[shortest] = true;
        totalMovement += minDistance;
        current = request[shortest];
    }

    cout << "Total Head Movement = " << totalMovement << endl;

    return 0;
}
