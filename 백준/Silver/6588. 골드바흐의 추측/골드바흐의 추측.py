import sys

def solution():
    is_prime = [True for _ in range(1000001)]
    for i in range(2, 1001):
        if is_prime[i]:
            for j in range(i*i, 1000001, i):
                is_prime[j] = False

    while True:
        n = int(sys.stdin.readline())
        if n == 0:
            break

        for i in range(3, int(n/2)+1, 2):
            if is_prime[i] and is_prime[n-i]:
                print(f'{n} = {i} + {n-i}')
                break
        else:
            print("Goldbach's conjecture is wrong.")
solution()            
    
        
    