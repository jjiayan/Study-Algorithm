import sys
input = sys.stdin.readline

def cnt_combinations(arr, r, s):
    result = []
    
    def dfs(start, cur):
        if len(cur) == r:
            if sum(cur) == s:
                result.append(cur)
            return

        for i in range(start, len(arr)):
            cur.append(arr[i])
            dfs(i+1, cur)
            cur.pop()
            
    dfs(0, [])
    return len(result)

def solve():
    n, s = map(int, input().split())
    arr = list(map(int, input().split()))
    cnt_subsequences = 0
    
    for i in range(1, n+1):
        cnt_subsequences += cnt_combinations(arr, i, s)
    
    print(cnt_subsequences)
    

if __name__ == "__main__":
    solve()