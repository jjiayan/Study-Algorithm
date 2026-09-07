def solution(routes):
    route = sorted(routes, key=lambda x: (x[0], x[1]))
    overlaped = []
    
    for r in route:
        i, o = r
        if not overlaped:
            overlaped.append([i, o])
        else:
            x, y = overlaped[-1]
            # 겹치지 않음
            if y < i:
                overlaped.append([i, o])
            # 겹침
            else:
                overlaped.pop()
                overlaped.append([i, min(y, o)])
    
    return len(overlaped)