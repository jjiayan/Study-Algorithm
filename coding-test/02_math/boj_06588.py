import sys
input = sys.stdin.readline

def get_primes(n):
    is_primes = [True] * (n + 1)
    is_primes[0] = is_primes[1] = False
    
    for i in range(2, int(n ** 0.5) + 1):
        if is_primes[i]:
            for j in range(i * i, n + 1, i):
                is_primes[j] = False
    return is_primes
    

def solve():
    primes = get_primes(1000000)
    while True:
        n = int(input())
        if n == 0:
            break
        for p in range(3, n // 2 + 1, 2):
            if primes[p] and primes[n-p]:
                print(f'{n} = {p} + {n-p}')
                break

if __name__ == "__main__":
    solve()