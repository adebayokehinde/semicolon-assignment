function displaySortedNumbers(num1, num2, num3) {
    let numbers = [num1, num2, num3];
    numbers.sort((a, b) => a - b);
    console.log(`The sorted numbers are: ${numbers[0]}, ${numbers[1]}, ${numbers[2]}`);
    return numbers;
}

function promptAndDisplaySortedNumbers() {
    let num1 = parseFloat(prompt("Enter the first number:"));
    let num2 = parseFloat(prompt("Enter the second number:"));
    let num3 = parseFloat(prompt("Enter the third number:"));

    if (num1 < num2 && num2 < num3){ 
	console.log(num1, num2, num3)
    }
console.log(displaySortedNumbers()) 	
