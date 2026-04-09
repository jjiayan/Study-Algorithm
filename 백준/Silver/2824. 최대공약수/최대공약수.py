import sys
input = sys.stdin.readline

def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a

def solve():
    n = int(input())
    ns = list(map(int, input().split()))
    m = int(input())
    ms = list(map(int, input().split()))
    
    is_over = False
    total_gcd = 1
    i, j = 0, 0
    while i < n:
        a = ns[i]
        for j in range(m):
            g = gcd(a, ms[j])
            if g == 1: continue
            
            total_gcd *= g
            if total_gcd >= 1000000000:
                is_over = True
                total_gcd %= 1000000000
            ms[j] //= g
            a //= g
            if a == 1:
                break
        i += 1
            
            
    if is_over:
        print(f"{total_gcd:09d}")
    else:
        print(total_gcd)
if __name__ == "__main__":
    solve()