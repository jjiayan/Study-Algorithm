'''
빈 공간 하나의 좌표 집합 추출
퍼즐 조각 하나의 좌표 집합 추출
좌표를 원점 기준으로 정규화
'''

def solution(game_board, table):
    n = len(game_board)
    g, t = [], []
    
    def dfs(x, y, num):
        board = game_board if num == 0 else table
        board[x][y] = 2
        
        shape = [(x, y)]
        stack = [(x, y)]
        dx, dy = [1, 0, -1, 0], [0, 1, 0, -1]
        
        while stack:
            cx, cy = stack.pop()
            
            for i in range(4):
                nx, ny = cx + dx[i], cy + dy[i]

                if (nx >= 0 and nx < n and ny >= 0 and ny < n) and board[nx][ny] == num:
                    stack.append((nx, ny))
                    shape.append((nx, ny))
                    board[nx][ny] = 2
                    
        min_x = min(xx for xx, _ in shape)
        min_y = min(yy for _, yy in shape)
        return sorted([(xx-min_x, yy-min_y) for xx, yy in shape])       
    
    for i in range(n):
        for j in range(n):
            if game_board[i][j] == 0:
                g.append(dfs(i, j, 0))
            if table[i][j] == 1:
                t.append(dfs(i, j, 1))
    
    def rotation(arr):
        shape = []
        for x, y in arr:
            shape.append((y, -x))
        min_x = min(xx for xx, _ in shape)
        min_y = min(yy for _, yy in shape)
        return sorted([(xx-min_x, yy-min_y) for xx, yy in shape])       
    
    cnt = 0
    used = [False] * len(t)
    for blank in g:
        matched = False
        for idx, piece in enumerate(t):
            if len(blank) != len(piece) or used[idx]:
                continue
            for _ in range(4):
                cur = piece
                if blank == cur: 
                    matched = True
                    cnt += len(blank)
                    break
                
                piece = rotation(cur)
            if matched: 
                used[idx] = True
                break
        
    return cnt