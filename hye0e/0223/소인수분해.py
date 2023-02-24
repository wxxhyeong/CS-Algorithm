import sys

input = sys.stdin.readline

b = int(input())
a = 2
while b > 1:
    if b % a == 0:
        b //= a
        print(a)
    else:
        a += 1

    if b == 1:
        break
