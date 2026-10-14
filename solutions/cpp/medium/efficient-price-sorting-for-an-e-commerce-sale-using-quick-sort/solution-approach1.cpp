// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/efficient-price-sorting-for-an-e-commerce-sale-using-quick-sort/problem?isFullScreen=true
// Problem     Sorting: Efficient Price Sorting for an E-Commerce Sale using Quick Sort
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-14, 08:38 p.m.
// ──────────────────────────────────────────────────


#include <iostream>
using namespace std;

void quickSort(int a[], int low, int high) {
    if (low < high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        int p = i + 1;

        quickSort(a, low, p - 1);
        quickSort(a, p + 1, high);
    }
}

int main() {
    int n;
    cin >> n;

    int a[100000];

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    quickSort(a, 0, n - 1);

    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }

    return 0;
}
