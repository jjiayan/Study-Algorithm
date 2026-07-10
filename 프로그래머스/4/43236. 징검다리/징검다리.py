def solution(distance, rocks, n):
    rocks.sort()
    rocks.append(distance)
    left, right = 0, distance
    answer = 0
    while left <= right:
        mid = (left + right) // 2
        prev = 0
        cnt = 0
        for r in rocks:
            # 제거
            if mid > r - prev:
                cnt += 1
            # 남김
            else: 
                prev = r
        if cnt > n:
            right = mid - 1
        else:
            answer = max(answer, mid)
            left = mid + 1
    return answer
        
    
    