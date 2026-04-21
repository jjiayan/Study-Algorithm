import sys
input = sys.stdin.readline

def permutations(arr, r):
    result = []
    visited = [False] * len(arr)
    
    def dfs(cur):
        if len(cur) == r:
            result.append(cur[:])
            return
        
        for i in range(len(arr)):
            if not visited[i]:
                visited[i] = True
                cur.append(arr[i])
                dfs(cur)
                cur.pop()
                visited[i] = False
                
    dfs([])
    return result

def solve():
    n, m = map(int, input().split())
    for p in permutations(range(1, n+1), m):
        print(*p)
     

if __name__ == "__main__":
    solve()