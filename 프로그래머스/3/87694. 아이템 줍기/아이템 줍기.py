from collections import deque

def rmap(arr):
    maps = [[0 for _ in range(101)] for _ in range(101)]
    # 직사각형 채우기
    for r in arr:
        x1, y1, x2, y2 = r
        for j in range(y1*2, y2*2+1):
            for i in range(x1*2, x2*2+1):
                maps[i][j] = 1
    # 직사각형 테두리 분리하기
    for r in arr:
        x1, y1, x2, y2 = r            
        for j in range(y1*2+1, y2*2):
            for i in range(x1*2+1, x2*2):
                maps[i][j] = 0
    return maps      

def solution(rectangle, characterX, characterY, itemX, itemY):
    maps = rmap(rectangle)    
    queue = deque([[characterX*2, characterY*2, 0]])
    dx, dy = [1, 0, -1, 0], [0, 1, 0, -1]
    
    while queue:
        cx, cy, dist = queue.popleft()
        maps[cx][cy] = 2
        if cx == itemX*2 and cy == itemY*2:
            return dist // 2
        
        for i in range(4):
            nx, ny = cx + dx[i], cy + dy[i]
            
            # 범위 체크 + 길 여부 확인
            if (nx >= 0 and nx <= 100 and ny >= 0 and ny <= 100) and maps[nx][ny] == 1:
                queue.append([nx, ny, dist + 1])
            
