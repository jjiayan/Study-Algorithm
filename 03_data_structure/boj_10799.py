import sys
input = sys.stdin.readline

def solve():
    inputs = input().strip()
    arr = []
    total = 0
    for i in range(len(inputs)):
        if inputs[i] == '(': arr.append('(')
        # 레이저일 때
        elif inputs[i] == ')' and inputs[i-1] == '(':
            arr.pop()
            total += len(arr)
        # 막대 끝
        elif inputs[i] == ')' and inputs[i-1] == ')':
            arr.pop()
            total += 1
    
    print(total)
    
if __name__ == "__main__":
    solve()