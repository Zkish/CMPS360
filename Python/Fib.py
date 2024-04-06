n = int(input("enter the story point number: "))
a, b = 0, 1
print("Fibonacci Sequence: ")
for _ in range(n):
    print(a, end=" ")
    a, b = b, a + b
    continue