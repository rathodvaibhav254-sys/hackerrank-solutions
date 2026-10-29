// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/contests/ku-uit-daa/challenges/math-based-algorithm-four-divisors/problem?isFullScreen=true
// Problem     Math Based Algorithm - Four Divisors
// Difficulty  Medium
// Subdomain   N/A
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-10-29, 09:32 p.m.
// ──────────────────────────────────────────────────


#include <bits/stdc++.h>
using namespace std;

int divisorSum(int num)
{
    int count = 0;
    int sum = 0;

    for (int i = 1; i * i <= num; i++)
    {
        if (num % i == 0)
        {
            count++;
            sum += i;

            int other = num / i;

            if (other != i)
            {
                count++;
                sum += other;
            }

            if (count > 4)
                return 0;
        }
    }

    if (count == 4)
        return sum;

    return 0;
}

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    long long answer = 0;

    for (int i = 0; i < n; i++)
    {
        int num;
        cin >> num;

        answer += divisorSum(num);
    }

    cout << answer << '\n';

    return 0;
}
