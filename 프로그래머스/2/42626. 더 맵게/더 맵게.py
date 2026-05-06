import heapq

def solution(scoville, K):
    cnt = 0
    heapq.heapify(scoville)
    
    while scoville[0] < K:
        if len(scoville) < 2:
            return -1
        new = heapq.heappop(scoville) + heapq.heappop(scoville) * 2
        heapq.heappush(scoville, new)
        cnt += 1
    
    return cnt
            
    
