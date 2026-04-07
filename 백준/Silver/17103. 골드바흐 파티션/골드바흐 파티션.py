import sys
input = sys.stdin.readline

def get_primes(n):
    is_primes = [True] * (n + 1)
    is_primes[0] = is_primes[1] = False
    
    for i in range(2, int(n ** 0.5) + 1):
        if is_primes[i]:
            for j in range(i*i, n + 1, i):
                is_primes[j] = False
    return is_primes

def solve():
    primes = get_primes(1000000)
    t = int(input())
    for _ in range(t):
        cnt = 0
        n = int(input())
        for p in range(2, n // 2 + 1):
            if primes[p] and primes[n-p]:
                cnt += 1
        print(cnt)

if __name__ == "__main__":
    solve()