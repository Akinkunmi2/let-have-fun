import java.util.Scanner;
public class TaskEight{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int count = 0;
int total = 0;
for(int number = 1; number<= 10; number++){
System.out.print("Enter an integer between 1 and 100: ");
int numberEntered = input.nextInt();

count++;
total+= numberEntered;

if(numberEntered == 0 &&numberEntered <= 100){





}
else if(numberEntered > 100){
continue;

}




}
System.out.println("The sum of the number you entered is "+  total);
}
}












