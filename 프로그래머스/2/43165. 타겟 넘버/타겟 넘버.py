# input: index, sum 
# 종료 조건 index = len(numbers), sum = target
# return 1    
def solution(numbers, target):
    
    def dfs(index, cur_sum): 
        
        if index == len(numbers):
            if cur_sum == target:
                return 1
            return 0
        
        v = numbers[index]
        index += 1
        
        return dfs(index, cur_sum + v) + dfs(index, cur_sum - v)        
            
    return dfs(0, 0)

