# def solution(number, k):
#     n = list(map(int, number))
#     # max_value = max(n)
#     result = ''
#     len_result = len(number) - k
    
#     # step 1
#     max_index = n.index(max(n[:k+1]))
#     # max_index = max(range(k + 1), key=lambda i: n[i])
#     max_index = max(range(k + 1), key=n.__getitem__)
#     cur_index = max_index + 1
#     # tmp = n[max_index+1:]
#     k -= max_index
#     result += str(n[max_index])
    
#     # step 2
#     # max_index = n.index(max(n[cur_index:cur_index+k+1]))
#     # 앞으로 볼 수 있는 범위가 k+1보다 짧아지면, 실제 남아 있는 숫자까지만 본다
#     while len(result) < len_result:
#         if k == 0:
#             result += ''.join(str(x) for x in n[cur_index:cur_index + len_result - len(result)])
#             break
        
#         min_range = min(k+1, len(n) - cur_index)
#         # max_index = cur_index + max(range(min_range), key=lambda i: n[cur_index:cur_index+min_range][i])
#         end = cur_index + min_range
#         max_index = cur_index
#         for i in range(cur_index + 1, end):
#             if n[i] > n[max_index]:
#                 max_index = i
                
#         k -= max_index - cur_index
#         result += str(n[max_index])
#         cur_index = max_index + 1
    
#     # while max_value > 0:
#     #     if max_value not in n:
#     #         max_value -= 1
#     #         continue
#     #     max_index = n.index(max_value)
#     #     if max_index > k:
#     #         max_value -= 1
#     #     elif max_index == k:
#     #         result += ''.join([str(x) for x in n[max_index:]])
#     #         break
#     #     else:
#     #         n = n[max_index+1:]
#     #         k = k - max_index
#     #         result += str(max_value)
#     #         max_value = max(n)
            
#     # print(max_value, result, k, n)
#     return result

from collections import deque

def solution(number, k):
    n = list(map(int, number))
    result = ''
    len_result = len(number) - k

    # step 1
    max_index = max(range(k + 1), key=n.__getitem__)
    cur_index = max_index + 1
    k -= max_index
    result += str(n[max_index])

    # step 2
    # [수정] 현재 탐색 범위의 최댓값 위치를 deque로 관리
    # 매번 범위를 처음부터 탐색하지 않도록 함
    dq = deque()

    # 현재 탐색 범위의 끝
    end = cur_index + k

    # [수정] 현재 범위 [cur_index, end]를 deque에 저장
    for i in range(cur_index, min(end + 1, len(n))):
        while dq and n[dq[-1]] < n[i]:
            dq.pop()
        dq.append(i)

    while len(result) < len_result:
        if k == 0:
            result += ''.join(map(str, n[cur_index:cur_index + len_result - len(result)]))
            break

        # [수정] 범위 밖으로 나간 인덱스 제거
        while dq and dq[0] < cur_index:
            dq.popleft()

        # [수정] deque의 첫 번째가 현재 범위의 최댓값 위치
        max_index = dq[0]

        k -= max_index - cur_index
        result += str(n[max_index])
        cur_index = max_index + 1

        if len(result) == len_result:
            break

        # [수정] 다음 탐색 범위의 끝은 이전 범위의 끝보다 정확히 1 증가
        end += 1

        # 새로운 범위에 추가되는 숫자는 딱 하나
        if end < len(n):
            while dq and n[dq[-1]] < n[end]:
                dq.pop()
            dq.append(end)

    return result