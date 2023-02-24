import sys

input = sys.stdin.readline

def get_prime_num(num):
    prime_num = [True for i in range(num)]
    for i in range(2, 1001):
        if prime_num[i]:
            for j in range(i + i, num, i):
                prime_num[j] = False

    return prime_num

prime_num = get_prime_num(1000000)
a, b = 0, 0

while True:
    num = int(input().strip())
    answer = []
    if num == 0:
        break

    check = 0
    for i in range(3, len(prime_num)):
        if prime_num[i] and prime_num[num - i]:
            print(num, ' = ', i, ' + ', num - i)
            check = 1
            break

    if check == 0:
        print('Goldbach\'s conjecture is wrong.')
