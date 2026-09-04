def solution(n, costs):
    cst = sorted(costs, key=lambda x:x[2])
    parent = [i for i in range(n)]
    result = 0
    
    def find(x):
        if parent[x] != x:
            parent[x] = find(parent[x])
        return parent[x]

    def union(x, y):
        rx, ry = find(x), find(y)
        if rx != ry:
            parent[ry] = rx
    
    for i in range(len(costs)):
        
        if len(set(parent)) == 1:
            break
        
        a, b, c = cst[i]
        if find(a) != find(b):
            union(a, b)
            result += c

    return result
        