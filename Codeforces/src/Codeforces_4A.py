n = int(input())

b = False
for i in range(2, n):
    if i % 2 == 0 and (n - 2) % 2 == 0:
        b = True
        break

if b:
    print("YES")
else:
    print("NO")