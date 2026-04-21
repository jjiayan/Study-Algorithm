import sys
input = sys.stdin.readline

def div_5(x):
    cnt = 0
    while x > 1:
        cnt += x // 5
        x //= 5
        
    return cnt

def div_2(x):
    cnt = 0
    while x > 1:
        cnt += x // 2
        x //= 2
    return cnt

def solve():
    # C(n, r) = n! / r!(n-r)! 
    n, m = map(int, input().split())
    print(min(div_5(n) - div_5(m) - div_5(n-m), div_2(n) - div_2(m) - div_2(n-m)))

if __name__ == "__main__":
    solve()