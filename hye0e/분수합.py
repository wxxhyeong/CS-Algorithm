import sys

input = sys.stdin.readline

up_num1, down_num1 = map(int, input().split())
up_num2, down_num2 = map(int, input().split())

def gcd(a, b):
    while b > 0:
        a, b = b, a % b

    return a

gcd1 = gcd(down_num1, down_num2)
down_num = gcd1 * (down_num2 // gcd1) * (down_num1 // gcd1)
up_num = up_num1 * (down_num // down_num1) + up_num2 * (down_num // down_num2)

gcd2 = gcd(up_num, down_num)
if up_num % gcd2 == 0:
    up_num //= gcd2

if down_num % gcd2 == 0:
    down_num //= gcd2

print(up_num, down_num)







