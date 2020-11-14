#!/usr/bin/python3
import random


"""
Missing:
You're given 2 arrays, the first one has length n and the second has length n-1.
The second array has every single element that the first one does - except for one.
Find that element and return it.
"""


ns = []
x = 1000
a = 4000
r = 6000
for i in range(10):
    ns.append(x)
    x += a
    a += r

print(ns)

for n in ns:
    a = list(range(n))
    b = list(range(n))
    random.shuffle(a)
    random.shuffle(b)
    ans = b[-1]
    b = b[:n-1]
    # RIG THA GAME
    i = a.index(ans)
    a[i], a[n//2] = a[n//2], ans

    with open(f'test/{n}.in', 'w') as input_file:
        input_file.write(f'{n}\n')
        input_file.write(f'{" ".join(map(str, a))}\n')
        input_file.write(f'{" ".join(map(str, b))}\n')
    with open(f'test/{n}.out', 'w') as output_file:
        output_file.write(f'{ans}')