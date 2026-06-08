

def solution(n, computers):
    visited = [False] * n
    network_cnt = 0
    stack = []
    
    def dfs(start):
        stack = [start]
        while stack:
            node = stack.pop()

            if not visited[node]:
                visited[node] = True

                for j in range(n):
                    if j != node and computers[node][j] == 1:
                        stack.append(j)
    
    for i in range(n):
        if not visited[i]:
            dfs(i)
            network_cnt += 1
            
    return network_cnt