import java.util.Scanner;
	public class FourPattern3{
	public static void main(String[] args){

Scanner input = new Scanner(System.in);

for (int i = 1; i <= 6; i++){
for (int j = 6; j >= i; j--){
System.out.print("  ");
}
for (int k = 1; k <= i; k++){
System.out.print(k + " ");
}
System.out.println();
}



}


}