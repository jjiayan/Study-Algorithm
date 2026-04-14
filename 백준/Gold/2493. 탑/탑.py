import sys
input = sys.stdin.readline

def solve():
    n = int(input())
    tops = [0] + list(map(int, input().split()))
    stack = [(0, 0)]
    
    for i in range(1, len(tops)):
        while stack and stack[-1][0] < tops[i]:
            stack.pop()
            
        if not stack: print(0, end=' ')
        else: print(stack[-1][1], end=' ')
        
        stack.append((tops[i], i))
    print()
        
if __name__ == "__main__":
    solve()