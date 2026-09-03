'''
- 작업번호, 작업요청시간, 작업소요시간 저장하는 대기큐
- 작업하지 않고, 대기큐 비어있지 않으면 가장 우선순위 높은 작업 시킴
    -> 소요시간 짧은 것, 작업요청 시각 빠른 것, 작업 번호 작은 순으로 우선순위 부여
- 작업 마칠 때까지 그 작업만 수행
'''
import heapq

def solution(jobs):
    jobs.sort()
    index, t = 0, 0
    heap = []
    total = len(jobs)
    end = 0
    cur = False
    while True:
        # print("i:", index, "t:", t, "heap:", heap)
        # 종료조건: 모든 작업이 대기큐에 들어갔고, 대기큐에 남은 작업이 없고, 진행중인 작업이 없을 경우
        if index == total and not heap and not cur:
            break
        
        # t 이전 작업 대기큐에 적재
        if index < total:
            start = index
            for i in range(start, total):
                s, l = jobs[i]
                # 요청시간이 t보다 작거나 같으면 힙큐에 추가
                if s <= t:
                    heapq.heappush(heap, [l, s])
                    index += 1
                # 요청시간이 t보다 크면 종료
                else:
                    break
        
        # 작업 진행 여부 
        # 작업중 아닐 경우
        # 힙 비었을 경우
        if not heap:
            t += 1
        # 힙 우선순위 작업 종료시간 더하기
        else:   
            l, s = heapq.heappop(heap)
            t += l
            end += t - s
        

     
    return end // total
