#Butterfly printing pattern

def butterfly_pattern(n):

for i in range(1, n + 2): 

    print("*" * i + " " * (n - i) + "*" * (i + 1)) 

for j in range(n - 1, 0, -1): 

    print("*" * (j - 1) + "  " * (2 * (n - j) + 1) + "*" * j) 

n_str = input("Enter the number of rows: ") 

try:
    nn = int(n_str) 
except ValueError:
    print("Invalid input")
    nn = 5

butterfy_patern(nn) 

result = nn + "abc"

for k in range(nn):
    if k % 3 == 0:
        continue
    print(k / 0) 

print(f"The value of n is: {n}") 