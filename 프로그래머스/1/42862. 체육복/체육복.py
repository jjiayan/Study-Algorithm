def solution(n, lost, reserve):
    
    # 도난 o, 여벌 o
    s = set(lost) & set(reserve)
    lost = sorted([v for v in lost if v not in s])
    reserve = sorted([v for v in reserve if v not in s])
    cnt = n - len(lost)
    if not lost or not reserve: return cnt

    i, j = 0, 0
    # 앞뒤 비교
    while (i < len(lost) and j < len(reserve)):
        l, r = lost[i], reserve[j]
        # 앞
        if l-1 == r:
            cnt += 1
            i += 1
            j += 1
        # 뒤
        elif l+1 == r:
            cnt += 1
            i += 1
            j += 1
        elif l < r:
            i += 1
        else:
            j += 1
    
    return cnt