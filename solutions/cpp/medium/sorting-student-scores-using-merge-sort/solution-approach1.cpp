// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/sorting-student-scores-using-merge-sort/problem?isFullScreen=true
// Problem     Sorting: Sorting Student Scores using Merge Sort
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-14, 08:45 p.m.
// ──────────────────────────────────────────────────


#include <iostream>
using namespace std;

int a[100000], temp[100000];

void merge(int low, int mid, int high) {
    int i = low;
    int j = mid + 1;
    int k = low;

    while (i <= mid && j <= high) {
        if (a[i] <= a[j]) {
            temp[k] = a[i];
            i++;
        } else {
            temp[k] = a[j];
            j++;
        }
        k++;
    }

    while (i <= mid) {
        temp[k] = a[i];
        i++;
        k++;
    }

    while (j <= high) {
        temp[k] = a[j];
        j++;
        k++;
    }

    for (int i = low; i <= high; i++) {
        a[i] = temp[i];
    }
}

void mergeSort(int low, int high) {
    if (low < high) {
        int mid = low + (high - low) / 2;

        mergeSort(low, mid);
        mergeSort(mid + 1, high);

        merge(low, mid, high);
    }
}

int main() {
    int n;
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    mergeSort(0, n - 1);

    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }

    return 0;
}
