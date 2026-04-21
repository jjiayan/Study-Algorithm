import sys
input = sys.stdin.readline

def solve():
    n = int(input())
    if n == 0 or n == 1:
        print(1)
        return
    result = 1
    for i in range(1, n+1):
        result *= i
    print(result)

if __name__ == "__main__":
    solve()