import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int count = 0;
int total = 0;
for(int number = 1; number<= 10; number++){
System.out.print("Enter an integer: ");
int numberEntered = input.nextInt();

count++;
total+= numberEntered;




}

System.out.print("The sum of the number you entered is " + total);








}

}
