import sys

input = sys.stdin.readline

P, K = map(int, input().strip().split())

for i in range(2, K):
    if P % i == 0:
        if i <= K or P//i <= K:
            print('BAD', min(i, P//i))
            exit()

print('GOOD')
