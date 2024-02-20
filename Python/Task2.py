# TASK2 SIMPLE CALCULATOR

a=int(input("Enter a Number: "))
b=int(input("Enter a NUmber: "))
print("give any operator of your choice among the below:")
print("+(Addition),\n-(Subtraction),\n*(Multiplication),\n/(Division),\n//(Floor Division),\n%(modulus Division),\n**(Exponentiation)")
print("Comparision operators include \n==,\n!=,\n>,\n<,\n,<=,\n>=")

c=input()
match c:
    case "+":
        print(a+b,"is the result of addition")
    case "-":
        print(a-b,"is the result of subtraction")
    case "*":
        print(a*b,"is the result of multiplication")
    case "/":
        print(a/b,"is the result of division")
    case "//":
        print(a//b,"is the result of floor division")
    case "%":
        print(a%b,"is the result of modulus division")
    case "**":
        print(a+b,"is the result of exponentiation")
    case "==":
        print(a==b,"is the result of comparision operator")
    case "!=":
        print(a==b,"is the result of comparision operator")
    case ">":
        print(a==b,"is the result of comparision operator")
    case "<":
        print(a<b,"is the result of comparision operator")
    case ">=":
        print(a>=b,"is the result of comparision operator")
    case "<=":
        print(a<=b,"is the result of comparision operator")
    case ">=":
        print(a>=b,"is the result of comparision operator")
    case _:
        print("No operator is there please! try again")