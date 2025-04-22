import java.util.Scanner;

public class LargeSmall {

public static void main (String[] args){

Scanner input = new Scanner(System.in);
 
	int small = 0;
	int large = 0;
	int num;
System.out.print("Enter the number: ");
int n = input.nextInt();

for(int i = 0; i < n; i++){
num = input.nextInt();
if (num > large){
   large = num;
	i++
}
System.out.println("The largest number ");

if (i == 0 && num > 0)
   small = num;
	i++
if (num < small)
    small = num;
	i++
System.out.println(small);
}







}

}