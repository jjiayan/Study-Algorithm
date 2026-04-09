import sys
input = sys.stdin.readline

def combinations(arr, r):
    result = []
    
    def dfs(start, cur):
        if len(cur) == r:
            result.append(cur[:])
            return
        
        for j in range(start, len(arr)):
            cur.append(arr[j])
            dfs(j+1, cur)
            cur.pop()        
    
    dfs(0, [])
    return result

def solve():
    n, m = map(int, input().split())
    comb = combinations(range(1, n+1), m)
    for c in comb:
        print(*c)

if __name__ == "__main__":
    solve()