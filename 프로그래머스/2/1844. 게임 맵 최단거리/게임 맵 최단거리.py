from collections import deque
# bfs 상태: 현재 위치, 이동한 칸 수
# 종료조건: 이동할 수 있는 칸 없을 떄
# 출력: 상대팀 도착했을 경우 -> 이동한 칸 수 반환, 아닐경우 -> -1

def solution(maps):
    m, n = len(maps), len(maps[0])
    
    queue = deque([[0, 0]])
    dx, dy = [1, 0, -1, 0], [0, 1, 0, -1]
    
    while queue:
        cx, cy = queue.popleft()
        
        for i in range(4):
            nx, ny = cx + dx[i], cy + dy[i]
            
            if (nx >= 0 and nx < m and ny >= 0 and ny < n) and maps[nx][ny] == 1:
                maps[nx][ny] = maps[cx][cy] + 1
                queue.append([nx, ny])
    
    return maps[m-1][n-1] if maps[m-1][n-1] != 1 else -1



