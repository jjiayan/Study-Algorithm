def solution(arr):
    nums, ops = [], []
    for a in arr:
        if a in {'+', '-'}:
            ops.append(a)
            continue
        nums.append(int(a))

    n = len(nums)
    # i번째 숫자부터 j번째 숫자까지 만들 수 있는 최솟값, 최댓값  
    dp = [[(0, 0)] * n for _ in range(n)]
    
    for gap in range(n):
        for i in range(n-gap):
            if gap == 0: dp[i][i] = (nums[i], nums[i])
            else:
                # 시작위치, 끊는위치 = i, i+gap
                mins = []
                maxs = []
                for j in range(i, i+gap):
                    left_min, left_max = dp[i][j][0], dp[i][j][1]
                    right_min, right_max = dp[j+1][i+gap][0], dp[j+1][i+gap][1]
                    if ops[j] == '+':
                        mins.append(left_min + right_min)
                        maxs.append(left_max + right_max)
                    else:
                        mins.append(left_min - right_max)
                        maxs.append(left_max - right_min)
                dp[i][i+gap] = (min(mins), max(maxs))
    
    return max(dp[0][n-1])