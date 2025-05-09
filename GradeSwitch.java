import java.util.Scanner;
	public class GradeSwitch{
	public static void main (String[] args){
Scanner input = new Scanner(System.in);

int a = 0;
int b = 0;
int c = 0;
int d = 0;
int f = 0;
int g = 0;

int userInput;

for (int count = 1; count  <= 10;){
System.out.println("Enter the score: ");
 userInput = input.nextInt();
if (userInput < 0 || userInput > 100){
System.out.println("Invalid");g++;
} else if(userInput <= 100 && userInput >= 0){
++count;

switch(userInput / 10){
	case 8,9,10: System.out.println(" A"); a++; break;
	case 7: System.out.println(" B"); b++; break;
	case 6: System.out.println(" C"); c++; break;
	case 5: System.out.println(" D"); d++; break;
	case 0,1,2,3,4: System.out.println(" F"); f++; break;

}
	
}

}

System.out.printf("The total number of Invalid: %d%n", g);
System.out.printf("The total number of Grade A: %d%n", a);
System.out.printf("The total number of Grade B: %d%n", b);
System.out.printf("The total number of Grade C: %d%n", c);
System.out.printf("The total number of Grade D: %d%n", d);
System.out.printf("The total number of Grade F: %d%n", f);




}


}