// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/bankers-deadlock-avoidance-algorithm/problem?isFullScreen=true
// Problem     Banker's Deadlock Avoidance Algorithm
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-08, 12:26 p.m.
// ──────────────────────────────────────────────────

#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n, m;

    cout << "Enter number of processes: " << endl;
    cin >> n;

    cout << "Enter number of resource types: " << endl;
    cin >> m;

    vector<vector<int> > allocation(n, vector<int>(m));
    vector<vector<int> > maxMatrix(n, vector<int>(m));
    vector<vector<int> > need(n, vector<int>(m));

    vector<int> available(m);
    vector<int> work(m);
    vector<bool> finish(n, false);
    vector<int> safeSequence;

    // Allocation Matrix
    cout << "Enter Allocation Matrix:" << endl;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> allocation[i][j];
        }
    }

    // Max Matrix
    cout << "Enter Max Matrix:" << endl;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> maxMatrix[i][j];

            // Need = Max - Allocation
            need[i][j] = maxMatrix[i][j] - allocation[i][j];
        }
    }

    // Available Resources
    cout << "Enter Available Resources: " << endl;

    for (int i = 0; i < m; i++) {
        cin >> available[i];
        work[i] = available[i];
    }

    // Banker's Algorithm
    int completed = 0;

    while (completed < n) {
        bool found = false;

        for (int i = 0; i < n; i++) {

            if (finish[i])
                continue;

            bool possible = true;

            // Check if Need <= Available
            for (int j = 0; j < m; j++) {
                if (need[i][j] > work[j]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {

                // Release allocated resources
                for (int j = 0; j < m; j++) {
                    work[j] += allocation[i][j];
                }

                safeSequence.push_back(i);
                finish[i] = true;
                completed++;
                found = true;
            }
        }

        // No process can execute
        if (!found)
            break;
    }

    // Check result
    if (completed == n) {

        cout << "System is in a SAFE STATE." << endl;

        cout << "Safe Sequence: ";

        for (int i = 0; i < n; i++) {
            cout << "P" << safeSequence[i] << " ";
        }

        cout << endl;

    } else {

        cout << "System is NOT in a safe state "
             << "(Deadlock may occur)." << endl;
    }

    return 0;
}
