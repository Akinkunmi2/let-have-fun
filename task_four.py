num_sum = 0
count = 0

for numbers in range(1,11):
    number = int(input("Enter an integer: " ))
    if numbers % 2 == 0:
        count+=1
        num_sum += numbers


print("The average of the numbers entered is " , num_sum)
