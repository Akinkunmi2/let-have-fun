import java.util.Scanner;
public class TaskSeven{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double count = 0;
double total = 0;
for(int number = 1; number<= 10; number++){






System.out.print("Enter an integer: ");
double numberEntered = input.nextInt();
if(numberEntered % 2 == 0){
count++;
total += numberEntered;
double average = total/count;
System.out.println("The sum of the even numbers is " + total);
System.out.println("The average of the even numbers is " + average + " " );
}
}
}
}
