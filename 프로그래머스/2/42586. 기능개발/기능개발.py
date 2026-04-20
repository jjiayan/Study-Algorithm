import math
import collections

def solution(progresses, speeds):
    que = collections.deque()
    res = []
    
    for i in range(len(progresses)):
        # 개발은 미리 할 수 있고, 배포는 순서대로
        dev = math.ceil((100 - progresses[i]) / speeds[i]) 
        if i == 0 or que[-1] < dev:
            que.append(dev)
            res.append(1)
        elif que[-1] >= dev:
            res[-1] += 1
    
    return res
            
            
        
    return list(que)
