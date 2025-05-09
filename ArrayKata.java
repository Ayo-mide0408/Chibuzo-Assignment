public class ArrayKata {

	public static int maximumIn(int [] numbers) {
	
	int max = numbers[0];
	for(int count = 0; count < numbers.length; count++) {
		if (numbers[count] > max)
		max = numbers[count];
}
	return max;
}


public static int minimumIn(int [] numbers) {
	
	int mini = numbers[0];
	for(int count = 0; count < numbers.length; count++) {
		if (numbers[count] < mini)
		mini = numbers[count];
}
	return mini;
}

public static int sumOf(int [] numbers) {
	
	int total = 0;
	for(int count = 0; count < numbers.length; count++) {
		total += numbers[count];
}
	return total;
}


public static int sumOfEvennumber(int [] numbers) {
	
	int evenNumbers = 0;
	for(int count = 0; count < numbers.length; count++) {
		if(numbers[count] % 2 == 0) {
		evenNumbers += numbers[count];
}
}
	return evenNumbers;
}

public static int sumOfOddnumber(int [] numbers) {
	
	int oddNumbers = 0;
	for(int count = 0; count < numbers.length; count++) {
		if(numbers[count] % 2 != 0) {
		oddNumbers += numbers[count];
}
}
	return oddNumbers;
}

public static int noOfOddnumber(int [] numbers) {
	
	int oddNumbers = 0;
	for(int count = 0; count < numbers.length; count++) {
		if(numbers[count] % 2 != 0) {
		oddNumbers++;
}
}
	return oddNumbers;
}



public static int noOfEvennumber(int [] numbers) {
	
	int evenNumbers = 0;
	for(int count = 0; count < numbers.length; count++) {
		if(numbers[count] % 2 == 0) {
		evenNumbers++;
}
}
	return evenNumbers;
}
















}