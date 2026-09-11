def solution(n):
    
    f = [0] * (n+1)
    
    for i in range(n+1):
        if i == 0 or i == 1:
            f[i] = i
        else:
            f[i] = (f[i-1] + f[i-2]) % 1234567
            
    return f[n]