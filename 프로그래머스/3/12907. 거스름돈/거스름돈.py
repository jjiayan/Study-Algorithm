def solution(n, money):
    MOD = 1000000007
    money.sort()
    
    # dp[i]는 i원을 만들 수 있는 방법의 수
    dp = [0] * (n+1)
    dp[0] = 1
    
    for m in money:
        for i in range(m, n+1):
            dp[i] = (dp[i] + dp[i-m]) % MOD
    
    return dp[n]