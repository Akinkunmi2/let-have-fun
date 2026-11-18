num_sum = 0
count = 0

for numbers in range(1,11):
    number = int(input("Enter an integer between 0 and 100: " ))
    if number == 0 and number <= 100:
        count+=1
        num_sum += number


    elif number > 100:
        continue  
average = num_sum/ count
print("The sum of the numbers is " , num_sum)
print("The average of the numbers entered is " , average)

    

