import java.util.Scanner;
public class TaskFive{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int count = 0;
int total = 0;
for(int number = 1; number<= 10; number++){






System.out.print("Enter an integer: ");
int numberEntered = input.nextInt();

count++;


if(numberEntered % 2 == 0){
total += numberEntered;
System.out.println("The sum of the even numbers is " + total + " " );
}
}
}
}
