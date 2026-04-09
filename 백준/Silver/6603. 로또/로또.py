import sys
input = sys.stdin.readline

def combinations(arr, r):
    result = []
    
    def dfs(start, cur):
        if len(cur) == r:
            result.append(cur[:])
            return
        
        for i in range(start, len(arr)):
            cur.append(arr[i])
            dfs(i+1, cur)
            cur.pop()
    
    dfs(0, [])
    return result

def solve():
    while True:
        tmp = list(map(int, input().split()))
        if tmp == [0]:
            return
        s = tmp[1:]

        for c in combinations(s, 6):
            print(*c)
        print()
        
if __name__ == "__main__":
    solve()