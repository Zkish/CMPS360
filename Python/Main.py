# Functions
def Rectangle():
    length = int(input("length of the rectangle = "))
    width = int(input("width of the rectangle = "))
    area = length * width
    print(f"the area of the rectangle = {area}")
    return

def Even_Odd():
    num = int(input("Enter a number: "))
    if num % 2 == 0:
        print(f"{num} is even.")
    else:
        print(f"{num} is odd.")
        return

def MaxValue():
    num1 = int(input("enter the first number: "))
    num2 = int(input("enter the second number: "))
    num3 = int(input("enter the third number: "))
    maxValue = max(num1, num2, num3)
    print(f"The max value of the numbers is {maxValue}")
    return

def Factorial():
    num = int(input("Enter a Number: "))
    factorial = 1
    for i in range(1, num, 1):
        factorial *- i
        print(f"The factorial of {num} is {factorial}")
        return

def reverseString():
    string = input("Enter a string value: ")
    reverse = string[::-1]
    print(f"The reverse of {string} is {reverse}")
    return

# EXECUTED CODE : uncomment to view other things
# Rectangle()
# Even_Odd()
# MaxValue()
# Factorial()
reverseString()