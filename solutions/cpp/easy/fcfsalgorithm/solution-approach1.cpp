// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/fcfsalgorithm/problem?isFullScreen=true
// Problem     First-Come,First-Served CPU Scheduling Algorithm
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-02, 09:54 a.m.
// ──────────────────────────────────────────────────

#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>
#include <iomanip> // Added for setprecision

using namespace std;

struct Process {
    int id;
    int at;
    int bt;
    int ct;
    int tat;
    int wt;
};

int main() {
    int n;
    cout << "Enter number of processes: " << endl;
    if (!(cin >> n)) return 0;
    
    vector<Process> p(n);
    for(int i = 0; i < n; i++) {
        p[i].id = i + 1;
        cout << "Enter Arrival Time and Burst Time for P" << (i + 1) << ": " << endl;
        cin >> p[i].at >> p[i].bt;
    }
    
    for(int i = 0; i < n - 1; i++) {
        for(int j = 0; j < n - i - 1; j++) {
            if(p[j].at > p[j+1].at) {
                Process temp = p[j];
                p[j] = p[j+1];
                p[j+1] = temp;
            }
        }
    }
    
    int current_time = 0;
    float total_tat = 0, total_wt = 0;
    
    for(int i = 0; i < n; i++) {
        if(current_time < p[i].at) {
            current_time = p[i].at;
        }
        
        current_time += p[i].bt;
        p[i].ct = current_time;
        
        p[i].tat = p[i].ct - p[i].at;
        p[i].wt = p[i].tat - p[i].bt;
        
        total_tat += p[i].tat;
        total_wt += p[i].wt;
    }
    
    cout << fixed << setprecision(2);
    cout << "Average Turnaround Time: " << (total_tat / n) << endl;
    cout << "Average Waiting Time: " << (total_wt / n) << endl;
    
    return 0;
}
