import java.util.Scanner;

public class Factorial {

public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number: ");

int number = input.nextInt();

long factorial = 1;

for (int counter = 1; counter <= number; counter++){
	factorial *= counter;
}

System.out.println("Factorial of given number " + number + " = " + factorial);

}


}