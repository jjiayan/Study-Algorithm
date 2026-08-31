import sys

sys.setrecursionlimit(10**6)


def solution(k, num, links):
    n = len(num)

    # root 찾기
    parent = [-1] * n

    for i in range(n):
        left, right = links[i]

        if left != -1:
            parent[left] = i

        if right != -1:
            parent[right] = i

    root = parent.index(-1)

    def check(limit):
        count = 0

        def dfs(node):
            nonlocal count

            left, right = links[node]
            cur = num[node]

            # 리프
            if left == -1 and right == -1:
                return cur

            # 왼쪽 자식만
            if right == -1:
                left_sum = dfs(left)

                if cur + left_sum <= limit:
                    return cur + left_sum

                count += 1
                return cur

            # 오른쪽 자식만
            if left == -1:
                right_sum = dfs(right)

                if cur + right_sum <= limit:
                    return cur + right_sum

                count += 1
                return cur

            # 자식 둘 다 존재
            left_sum = dfs(left)
            right_sum = dfs(right)

            # 둘 다 합쳐도 가능
            if cur + left_sum + right_sum <= limit:
                return cur + left_sum + right_sum

            # 하나만 합칠 수 있는 경우
            if cur + min(left_sum, right_sum) <= limit:
                count += 1
                return cur + min(left_sum, right_sum)

            # 둘 다 합칠 수 없는 경우
            count += 2
            return cur

        dfs(root)

        # root에 남은 그룹
        count += 1

        return count <= k

    # 답의 범위
    left = max(num)
    right = sum(num)

    while left < right:
        mid = (left + right) // 2

        if check(mid):
            right = mid
        else:
            left = mid + 1

    return left