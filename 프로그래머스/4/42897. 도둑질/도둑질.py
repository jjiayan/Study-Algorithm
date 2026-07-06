def solution(money):
    n = len(money)
    # dp[i] = 0번째 집부터 i번째 집까지 고려했을 때 얻을 수 있는 최대 금액
    dp = [0] * n
    dp[0] = money[0]
    dp[1] = max(money[1], dp[0])
        
    for i in range(2, n-1): 
        dp[i] = max(money[i] + dp[i-2], dp[i-1])
    
    dp2 = [0] * n
    dp2[0] = 0
    dp2[1] = money[1]
    
    for i in range(2, n): 
        dp2[i] = max(money[i] + dp2[i-2], dp2[i-1])
    
    return max(dp[n-2], dp2[n-1])
    
