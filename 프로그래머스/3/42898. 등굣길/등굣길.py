def solution(m, n, puddles):
    dp = [[0] * (m+1) for _ in range(n+1)]
    dp[1][1] = 1
    
    pddl = set()
    for p in puddles:
        a, b = p
        pddl.add((a, b))

    for j in range(1, n+1):
        for i in range(1, m+1):
            
            if i == 1 and j == 1:
                continue
                
            # 웅덩이 여부
            if (i, j) in pddl:
                continue
                
            dp[j][i] = (dp[j-1][i] + dp[j][i-1]) % 1000000007
            
    return dp[n][m] 