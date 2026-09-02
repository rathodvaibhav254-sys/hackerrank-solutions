// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-os/challenges/sjfalgorithm/problem?isFullScreen=true
// Problem     Non-Preemptive Shortest Job First CPU Scheduling Algorithm
// Difficulty  Easy
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-09-02, 09:58 a.m.
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
#include <iomanip> // Added this line for setprecision

using namespace std;

struct Process {
    int id;
    int at;
    int bt;
    int ct;
    int tat;
    int wt;
    bool is_completed = false;
};

int main() {
    int n;
    
    cout << "Enter number of processes: \n";
    if (!(cin >> n)) return 0;
    
    vector<Process> p(n);
    for(int i = 0; i < n; i++) {
        p[i].id = i + 1;
        cout << "Enter Arrival Time and Burst Time for P" << (i + 1) << ": \n";
        cin >> p[i].at >> p[i].bt;
    }
    
    int current_time = 0;
    int completed = 0;
    float total_tat = 0, total_wt = 0;
    
    while(completed != n) {
        int idx = -1;
        int min_bt = INT_MAX;
        
        for(int i = 0; i < n; i++) {
            if(p[i].at <= current_time && !p[i].is_completed) {
                if(p[i].bt < min_bt) {
                    min_bt = p[i].bt;
                    idx = i;
                } else if(p[i].bt == min_bt) {
                    if(p[i].at < p[idx].at) {
                        idx = i;
                    }
                }
            }
        }
        
        if(idx != -1) {
            current_time += p[idx].bt;
            p[idx].ct = current_time;
            
            p[idx].tat = p[idx].ct - p[idx].at;
            p[idx].wt = p[idx].tat - p[idx].bt;
            
            total_tat += p[idx].tat;
            total_wt += p[idx].wt;
            
            p[idx].is_completed = true;
            completed++;
        } 
        else {
            current_time++;
        }
    }
    
    cout << fixed << setprecision(2);
    cout << "Average Turnaround Time = " << (total_tat / n) << endl;
    cout << "Average Waiting Time = " << (total_wt / n) << endl;
    
    return 0;
}
