def solution(triangle):
    # dp 정의: (i, j)까지 최대 합
    dp = triangle
    
    for i in range(1, len(dp)):
        for j in range(len(dp[i])):
            if j == 0:
                dp[i][j] += dp[i-1][j]
            elif j == i:
                dp[i][j] += dp[i-1][j-1]
            else:
                dp[i][j] += max(dp[i-1][j-1], dp[i-1][j]) 
                
    return max(dp[-1])