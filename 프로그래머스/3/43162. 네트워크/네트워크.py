def solution(n, computers):
    visited = [False] * n
    network_cnt = 0
    stack = []
    
    for i in range(n):
        if not visited[i]:
            stack.append(i)
        
            while stack:
                node = stack.pop()

                if not visited[node]:
                    visited[node] = True

                    for j in range(n):
                        if j != node and computers[node][j] == 1:
                            stack.append(j)
            network_cnt += 1
            
    return network_cnt