import java.util.Scanner;
	public class Mortgage{
	public static void main(String[] args){

Scanner input = new Scanner (System.in);

System.out.println("Enter the Principal amount: ");
int principal = input.nextInt();

System.out.println("Enter the Rate: ");
double r = input.nextDouble();
double rate = r / 100 / 12;

System.out.println("Enter the duration: ");
double duration = input.nextDouble();

duration = duration * 12;

double amount = (principal) * ((rate * (Math.pow (1 + rate, duration))));

double rateDuration = (Math.pow (1 + rate, duration)) -1;

double monthly = amount / rateDuration;

System.out.printf("The monthly payment is $%.2f", monthly);




}
}