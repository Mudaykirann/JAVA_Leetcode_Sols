class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        // Create a boolean array "isPrime" and initialize
        // all entries as true. A value in isPrime[i] will
        // finally be false if i is Not a prime, true otherwise.
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        // We know that 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;

        // Only check odd numbers starting from 3, skip even numbers
        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {
                // Mark all odd multiples of i, starting from i*i
                for (int j = i * i; j < n; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count primes, considering 2 separately
        int count = 1; // since 2 is prime
        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
