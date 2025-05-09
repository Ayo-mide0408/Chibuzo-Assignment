public class Katakata{
	
	public static int isEven(int even){
if (even % 2 == 0){
	System.out.println("True, the number is an even number: ");
}else {
System.out.println("False, the number is an odd number.");
} 
return even;
}


public static int subtract(int firstNumber, int secondNumber){
int total = (int) Math.abs(firstNumber - secondNumber);
//System.out.println(total);
return total;
}


	public static int squareOf(int square){
int number = square * square;
return number;
}

	public static int factorialOf(int factorial){
int number = 1;
for (int counter = 1; counter <= factorial; counter++){
 number = number * counter;
}
return number;
}

	public static int isPalindrome(int userInput){
int number1 = userInput / 10000; 
userInput = userInput % 10000;

int number2 = userInput / 1000; 
userInput = userInput % 1000;

int number3 = userInput / 100; 
userInput = userInput % 100;

int number4 = userInput / 10;
userInput = userInput % 10;

int number5 = userInput / 1;
userInput = userInput % 1;



if (number1 == number5){
System.out.println("True, is a palindrome");
}else {
System.out.println("False, is not a palindrome ");
}

return userInput;

}


























}