function getname() {
	return "Kehinde"
};
console.log(getname());


const greet = function(){
	return "morning"
};
console.log(greet());

function assertEquals(){


	function getMen(){
		let numberOfMen = "23";
		return numberOfMen
	};
	
	function getLadies(){
		let numberOfLadies = 23;
		return numberOfLadies
	};

	return getMen() == getLadies()
};

console.log(assertEquals());

function count(){
	let value = 2;
	
	return{
		increment: function(){
			return value++
		},
		decrement: function() {
			return value --
		},
		getValue: function(){
			return value
		}
	}
};
let counter = count()
counter.increment();
console.log(counter.getValue());





let firstname = "chinedu"

function greetm(name){
	return `Hello ${name}`
};
function executeFunction(callBack, userName){
	return callBack(userName)
}

let result = executeFunction(greetm, firstname);
console.log(result)



function count(){
	let value = 0;
	console.log(value)

	function increaseValueByTwo(){
		let result = value +2
		console.log(result)
			console.log(value)
	}
	increaseValueByTwo()
}

count()















