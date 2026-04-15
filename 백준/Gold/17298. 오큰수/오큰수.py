import sys
input = sys.stdin.readline

def solve():
    n = int(input())
    a = [0] + list(map(int, input().split()))
    stack = [0]
    result = []
    
    # 오큰수 NGE(i): Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수중에서 가장 왼쪽에 있는 수
    for i in range(n, 0, -1):
        while stack and stack[-1] <= a[i]:
            stack.pop()
        
        if not stack: result.append(-1)
        else: result.append(stack[-1])
        
        stack.append(a[i])
    
    print(*result[::-1])

if __name__ == "__main__":
    solve()