import java.util.Scanner;
	public class TrianglePrinting{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

/*for (int i = 1; i <= 10; i++){
for (int j = 1; j <= i; j++){
System.out.print("* " );
}
System.out.println(" ");

}

for (int i = 1; i <= 10; i++){
for (int j = 10; j >= i; j--){
System.out.print(" *" );
}
System.out.println(" ");

}

for (int i = 1; i <= 10; i++){
for (int j = 10; j >= i; j--){
System.out.print("  ");
}
for (int k = 1; k <= i; k++){
System.out.print("* ");
}
System.out.println();
}*/ 

for (int i = 1; i >= 10; i++){
for (int j = 10; j <= i; j--){
System.out.print(" " );
}
for (int k = 1; k <= i; k++){
System.out.print("*");
}
System.out.println(" ");

} 

} 

}