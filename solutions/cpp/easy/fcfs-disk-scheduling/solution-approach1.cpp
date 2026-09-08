// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/fcfs-disk-scheduling/problem?isFullScreen=true
// Problem     FCFS Disk Scheduling
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 10:29 p.m.
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

    cout << "Enter the disk request sequence: " << endl;
    for (int i = 0; i < n; i++) {
        cin >> request[i];
    }

    int totalMovement = 0;
    int current = head;

    // FCFS Disk Scheduling
    for (int i = 0; i < n; i++) {
        totalMovement += abs(current - request[i]);
        current = request[i];
    }

    cout << "Total Head Movement = " << totalMovement << endl;

    return 0;
}
