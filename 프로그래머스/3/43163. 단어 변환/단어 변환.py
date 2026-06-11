from collections import deque

# 알파벳 하나만 다른지 확인
def diff(x, y):
    cnt = 0
    for i in range(len(x)):
        if cnt > 1: return False
        if x[i] != y[i]:
            cnt += 1
    return True if cnt == 1 else False

def solution(begin, target, words):
    queue = deque([(begin, 0)])
    visited = [False] * len(words)
    
    while queue:
        cur, cnt = queue.popleft()
        
        if cur == target: return cnt
    
        for i in range(len(words)):
            if diff(cur, words[i]) and not visited[i]:
                queue.append((words[i], cnt+1))
                visited[i] = True
                
    return cnt