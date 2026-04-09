import sys
from itertools import permutations
input = sys.stdin.readline

def solve():
    n = int(input())
    perm = list(permutations(range(1, n+1), n))
    for p in perm:
        print(*list(p))

if __name__ == "__main__":
    solve()