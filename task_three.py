num_sum = 0



for numbers in range(1,11):
    number = int(input("Enter an integer: " ))
    num_sum += number
    average = num_sum//10
print("The sum of the numbers is ", num_sum)
print("The average of the numbers entered is " , average)
