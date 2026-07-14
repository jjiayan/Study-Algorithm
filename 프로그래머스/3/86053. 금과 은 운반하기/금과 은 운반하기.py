import math
def solution(a, b, g, s, w, t):
    n = len(g)
    l, r = 0, 10 ** 15
    result = 0

    while l <= r:
        mid = (l + r) // 2
        gold, silver, total = 0, 0, 0
        
        for i in range(n):
            # 운반횟수
            cnt = mid // (2 * t[i])
            if mid % (2 * t[i]) >= t[i]:
                cnt += 1
            # 실제 운반 가능한 최대 무게
            move = cnt * w[i]
            
            gold += min(g[i], move)
            silver += min(s[i], move)
            total += min(g[i] + s[i], move)
            
        # 금 a 이상 / 은 b 이상 / 금+은 a+b 이상 운반 가능
        if gold >= a and silver >= b and total >= (a+b):
            result = mid
            r = mid - 1
        else:
            l = mid + 1
        
    return result
            
        
                
            
            