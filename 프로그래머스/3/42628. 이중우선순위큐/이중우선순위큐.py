import heapq

def solution(operations):
    answer = []
    check = []
    heapq.heapify(answer)
    heapq.heapify(check)
    for oper in operations:
        o, num = oper.split()
        if o == "I":
            # 삽입
            heapq.heappush(answer, int(num))
            heapq.heappush(check, -int(num))
        elif num == "1" and answer:
            # 최댓값 삭제
            max_value = heapq.heappop(check)
            answer.remove(-max_value)
        elif num == "-1" and answer:
            # 최솟값 삭제
            min_value = heapq.heappop(answer)
            check.remove(-min_value)
            
    if answer: return [-check[0], answer[0]]
    return [0, 0]