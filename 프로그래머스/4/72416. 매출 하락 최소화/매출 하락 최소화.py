import sys
sys.setrecursionlimit(10**6)

def solution(sales, links):
    n = len(sales)
    
    # dp[i][0] : i가 참석하지 않을 때 최소 매출
    # dp[i][1] : i가 참석할 때 최소 매출
    dp = [[0, 0] for _ in range(n+1)]
    
    # 트리 생성
    tree = [[] for _ in range(n+1)]
    for parent, child in links:
        tree[parent].append(child)
    
    def dfs(node):
        dp[node][1] = sales[node-1]
        
        if not tree[node]:
            return
        
        has_attendee = False
        base, extra = 0, float('inf')
        for child in tree[node]:
            dfs(child)
            
            if dp[child][0] < dp[child][1]:
                base += dp[child][0]
                extra = min(extra, dp[child][1] - dp[child][0])
            else:
                base += dp[child][1]
                has_attendee = True
        
        dp[node][1] += base
        
        if has_attendee:
            dp[node][0] = base
        else:
            dp[node][0] = base + extra
    
    dfs(1)
    
    return min(dp[1][0], dp[1][1])