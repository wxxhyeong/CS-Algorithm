import sys

input = sys.stdin.readline

N, K = map(int, input().split())

visited = [False for i in range(N + 1)]

start = 2
remove = -1
while K != 0:
    for i in range(start, N + 1, start):
        if not visited[i]:
            remove = i
            visited[i] = True
            K -= 1
        if K == 0:
            break
    start += 1

print(remove)