import math

def solution(n, times):
    times.sort()
    l, r = times[0], times[-1] * n
    tmin = math.inf
    
    while l <= r:
        t = (l + r) // 2
        
        tmp = 0
        for i in times:
            tmp += t // i
        
        if tmp >= n:
            tmin = min(t, tmin)
            r = t-1
        else:
            l = t+1
            
    return tmin
            
        