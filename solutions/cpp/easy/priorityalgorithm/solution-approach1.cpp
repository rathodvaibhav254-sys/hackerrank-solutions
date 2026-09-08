// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/priorityalgorithm/problem?isFullScreen=true
// Problem     Non-Preemptive Priority Scheduling algorithm
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 09:15 a.m.
// ──────────────────────────────────────────────────

#include <stdio.h>

int main() {
    int n;

    printf("Enter number of processes:\n");
    scanf("%d", &n);

    int at[n], bt[n], priority[n];
    int ct[n], tat[n], wt[n], completed[n];

    for (int i = 0; i < n; i++) {
        printf("Enter AT, BT and Priority for P%d:\n", i + 1);
        scanf("%d %d %d", &at[i], &bt[i], &priority[i]);
        completed[i] = 0;
    }

    int current_time = 0;
    int completed_count = 0;
    float total_tat = 0, total_wt = 0;

    while (completed_count < n) {
        int min_index = -1;
        int min_priority = 999999;

        for (int i = 0; i < n; i++) {
            if (!completed[i] && at[i] <= current_time) {
                if (priority[i] < min_priority) {
                    min_priority = priority[i];
                    min_index = i;
                }
            }
        }

        if (min_index == -1) {
            current_time++;
        } else {
            current_time += bt[min_index];

            ct[min_index] = current_time;
            tat[min_index] = ct[min_index] - at[min_index];
            wt[min_index] = tat[min_index] - bt[min_index];

            total_tat += tat[min_index];
            total_wt += wt[min_index];

            completed[min_index] = 1;
            completed_count++;
        }
    }

    printf("Average Turnaround Time = %.2f\n", total_tat / n);
    printf("Average Waiting Time = %.2f\n", total_wt / n);

    return 0;
}
