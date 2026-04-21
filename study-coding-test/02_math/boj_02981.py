import sys
input = sys.stdin.readline

def gcd(a, b):
    while b > 0:
        a, b = b, a % b
    return a
    

def solve():
    n = int(input())
    nums = sorted([int(input()) for _ in range(n)])
    diff = [0] * (n-1)
    for i in range(1, n):
        diff[i-1] = nums[i] - nums[i-1]
    if len(diff) == 1:
        cur = diff[0]
    else:
        cur = gcd(diff[0], diff[1])
        for i in range(2, n-1):
            cur = gcd(cur, diff[i])
    
    result = []
    for i in range(1, int(cur ** 0.5) + 1):
        if cur % i == 0:
            if i != 1:
                result.append(i)
            if i != cur // i:
                result.append(cur//i)
    print(*sorted(result))
    
if __name__ == "__main__":
    solve()