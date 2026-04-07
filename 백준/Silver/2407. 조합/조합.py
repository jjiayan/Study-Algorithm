import sys
input = sys.stdin.readline

def factorial(n):
    fac = [1] * (n+1)
    for i in range(2, n+1):
        fac[i] = fac[i-1] * i
    return fac

def solve():
    fac = factorial(100)
    n, m = map(int, input().split())
    print(fac[n] // (fac[m] * fac[n-m]))
    

if __name__ == "__main__":
    solve()