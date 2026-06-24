'''
상태: 현재공항, 현재까지 만든 경로, 사용한 티켓수
방문처리: 티켓기준
티켓정렬 -> DFS -> 백트래킹

현재 공항에서 갈 수 있는 티켓들을 순회한다.
↓
사용 안 한 티켓 선택
↓
경로 추가
↓
DFS
↓
실패하면 선택 취소
'''
def solution(tickets):
    tickets.sort()
    visited = [False] * len(tickets)

    def dfs(cur, path, used):

        if used == len(tickets):
            return path

        for i in range(len(tickets)):
            start, end = tickets[i]
            if start == cur and not visited[i]:
                visited[i] = True
                result = dfs(end, path + [end], used + 1)
                if result: return result
                visited[i] = False
        return None

    return dfs("ICN", ["ICN"], 0)