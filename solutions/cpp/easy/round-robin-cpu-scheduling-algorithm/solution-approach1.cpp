// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/round-robin-cpu-scheduling-algorithm/problem?isFullScreen=true
// Problem     Round Robin CPU Scheduling Algorithm
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 09:15 a.m.
// ──────────────────────────────────────────────────

#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int n, tq;

    cout << "Enter number of processes: \n";
    cin >> n;

    cout << "Enter Time Quantum: \n";
    cin >> tq;

    int at[n], bt[n], rt[n];
    int ct[n], tat[n], wt[n];

    for (int i = 0; i < n; i++) {
        cout << "Enter AT and BT for P" << i + 1 << ": \n";
        cin >> at[i] >> bt[i];
        rt[i] = bt[i];
    }

    int time = 0;
    int completed = 0;
    double total_tat = 0, total_wt = 0;

    while (completed < n) {
        bool executed = false;

        for (int i = 0; i < n; i++) {
            if (at[i] <= time && rt[i] > 0) {
                executed = true;

                if (rt[i] > tq) {
                    time += tq;
                    rt[i] -= tq;
                } else {
                    time += rt[i];
                    rt[i] = 0;

                    ct[i] = time;
                    tat[i] = ct[i] - at[i];
                    wt[i] = tat[i] - bt[i];

                    total_tat += tat[i];
                    total_wt += wt[i];

                    completed++;
                }
            }
        }

        if (!executed)
            time++;
    }

    cout << fixed << setprecision(2);
    cout << "Average Turnaround Time: " << total_tat / n << "\n";
    cout << "Average Waiting Time: " << total_wt / n << "\n";

    return 0;
}
