public class TwoLargestNumber{
	Public static void main(String[] args){
		
	int counter = 1;
	int largest = 0;
	int secondlargest = 0;
	
	while(counter <= 10) {
	System.out.print("Enter Number");
	int number = input.nextInt();

	if(number > largest) {
		largest = number;

	}
	if(number > secondlagest && number < largest){
		secondlargest = number;
		
	}
	counter++;
	System.out.print("The largest number is: " + largest");
	System.out.println("The second largest is:" + secondlargest);
}
}
}