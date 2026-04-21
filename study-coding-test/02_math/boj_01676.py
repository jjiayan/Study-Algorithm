import sys
input = sys.stdin.readline

def solve():
    n = int(input())
    if n == 0 or n == 1:
        print(0)
        return
    factorial = 1
    for i in range(1, n+1):
        factorial *= i
    
    cnt = 0
    for f in str(factorial)[::-1]:
        if f == '0':
            cnt += 1
        elif f != '0':
            break
    print(cnt)

if __name__ == "__main__":
    solve()