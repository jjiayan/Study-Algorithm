def operations(set1, set2):
    s = set()
    for s1 in set1:
        for s2 in set2:
            s.update([s1 + s2, s1 - s2, s1 * s2])
            if s2 != 0: s.add(s1 // s2)
    return s

def solution(N, number):
    answer = -1
    # N을 i번 사용하여 만들 수 있는 모든 숫자의 집합
    dp = [set() for _ in range(9)]
    
    for i in range(1, 9):
        # 자기자신 + 사칙연산
        dp[i].add(int(str(N)*i))
        for j in range(1, i):
            dp[i].update(operations(dp[j], dp[i-j]))        
    
        if number in dp[i]:
            answer = i
            break
            
    return answer
    