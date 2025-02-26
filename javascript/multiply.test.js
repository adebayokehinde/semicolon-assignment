const {multiply, addTwoNumbers} = require("./multiply.js");
		let numberOne = 2;
		let numberTwo = 6;		// Arrange

test("multiply two number", () =>{
	let result = multiply(numberOne, numberTwo);	// Act
	let answer = 12;
	expect(result).toBe(answer);	// Assert
});

test("add two numbers",()=> {
	let sum = addTwoNumbers(numberOne, numberTwo); 
	let answer = 8;
	expect(sum).toBe(answer);
});

test(' return odd number', () => {
	let arrayofNumbers = [1,2,3,4,5,6,7,8]
	let result = getOddNumbers(arrayofNumbers);
	let answer = [1,3,5];
	expect(result).toEqual(answer);
})