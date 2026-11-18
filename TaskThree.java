import java.util.Scanner;
public class TaskThree{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
double count = 0;
double total = 0;
for(int number = 1; number<= 10; number++){
System.out.print("Enter an integer: ");
double numberEntered = input.nextInt();

count++;
total+= numberEntered;




}
double average = total/count;

System.out.println("The sum of the number you entered is " + total);
System.out.println("The average of the number you have entered is" + average);
}
}



