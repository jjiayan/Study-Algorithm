import sys
input = sys.stdin.readline

def get_primes(n):
    is_prime = [True] * (n + 1)
    is_prime[0] = is_prime[1] = False 
    
    for i in range(2, int(n**0.5) + 1):
        if is_prime[i]:
            for j in range(i * i, n + 1, i):
                is_prime[j] = False
    return is_prime

def solve():
    primes = get_primes(10001)
    t = int(input())
    for _ in range(t):
        n = int(input())
        # 두 소수의 차이가 가장 작은 것 출력
        for p in range(n // 2, 0, -1):
            if primes[p] and primes[n-p]:
                print(p, n-p)
                break
            
if __name__ == "__main__":
    solve()