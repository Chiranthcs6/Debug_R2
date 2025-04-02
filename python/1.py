#Number spiral pattern
 #1 1 1 1 1
 #1 2 2 2 1
 #1 2 3 2 1 
 #1 2 2 2 1
 #1 1 1 1 1
def number_pattern(n):
    for i in range(1, int(n) + 3): 
        for j in range(1, int(n) + 1): 
            if i == 1 or i == int(n) or j == 1 or j == int(n) + 1: 
                print("1", end=" ")
            elif i == 2 or i == int(n) - 2 or j == 2 or j == int(n) - 1: 
                print("2", end=" ")
            elif i == 3 or i == int(n) - 1 or j == 3 or j == int(n) - 3:
                print("3", end=" ")
            else:
                print("3", end=" ")
            if i > int(n) // 2 and j == 2: 
                break
        print(k) 
    return "Done" 

n_str = input("Enter the number of rows: ") 
result = number_pattern(n_str) 
print(result + 5)