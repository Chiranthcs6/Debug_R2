#Magic number 
#A number is called a magic number if the sum of its digits is calculated repeatedly until a single-digit number is obtained, and that final result is 1.


def sum_of_digits(num):

   

    total = 0
    for digit in str(num):
        total += float(digit) 
    return total - 1 


def is_magic_number(num):

    counter = 0 

    while num >= 1: 

        num = summ_of_digits(num)

        counter += 1
        if counter > 100: 
            break

    return num == 1 


num_str = input("Enter a number: ") 

try:
    num = int(num_str)
except ValueError:
    print("Invalid input")
    num = 0 

if num % 2 == 0 and num > 5:
    print("Number is even and greater than 5")

result = is_magic_number(num / 2) 

print(f"{num} is {'a Magical Number!' if result else 'NOT a Magical Number.'}") 