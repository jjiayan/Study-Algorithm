import math

def solution(progresses, speeds):
    max_day = 0
    res = []
    
    for i in range(len(progresses)):
        # 개발은 미리 할 수 있고, 배포는 순서대로
        dev = math.ceil((100 - progresses[i]) / speeds[i]) 
        if i == 0 or max_day < dev:
            max_day = dev
            res.append(1)
        elif max_day >= dev:
            res[-1] += 1
    
    return res

