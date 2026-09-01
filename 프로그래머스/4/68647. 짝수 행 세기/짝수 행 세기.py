import math

def solution(a):
    n, m = len(a), len(a[0])
    MOD = 10**7 + 19
    
    # a 열별 1 개수 집계
    col = [0] * m
    for j in range(n):
        for i in range(m):
            if a[j][i] == 1:
                col[i] += 1
    
    dp = [0] * (n+1)
    dp[0] = 1
    
    for k in col:
        next_dp = [0] * (n+1)
        
        for odd in range(n+1):
            if dp[odd] == 0:
                continue
            
            for x in range(max(0, k - (n - odd)), min(k, odd) + 1):
                next_dp[odd-x+k-x] += dp[odd] * math.comb(odd, x) * math.comb(n-odd, k-x) % MOD
        
        dp = next_dp 
    
    return dp[0] 
                
                
            