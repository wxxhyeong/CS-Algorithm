import sys

input = sys.stdin.readline

num = list(map(int, input().strip()))
num.sort(reverse= True)

if num[-1] != 0:
    print(-1)
    exit()

temp_sum = sum(num)
if temp_sum % 3 == 0 and 0 in num:
    print(''.join(map(str, num)))
else:
    print(-1)
