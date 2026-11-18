num_sum = 0
count = 0

for numbers in range(1,11):
    number = int(input("Enter an integer: " ))
    if number % 2 == 0:
        count+=1
        num_sum += number
average = num_sum// count

print("The average of the numbers entered is " , num_sum)
