const person = {
		name:"Kehinde",
		age:"17",
		sex:"male",
		complexion:"dark",
		stateofOrigin:"lagos",
		country:"Nigeria",
};
console.log(person)


const laptop ={
		brand:"mac book",
		price:120000
};

laptop.colour = "blue"
console.log(laptop);

const phone = {
		brand: "Apple",
		price: 999
};

phone.price = 1500
console.log(phone) 

const personFullName = {
    firstName: "adebayo",
    lastName: "keinde",
    fullName: function() {
        return this.firstName + " " + this.lastName;
    }
};

console.log(personFullName.fullName());

const personAgain = {
		FirstName:"john",
		LastName:"doe",
		Age: 25
};
console.log(personAgain)


const book = {
		title:"The Great gatsby",
		author:"F. Scott Filzgerals",
		yearpublished:1925
};
const {title, author} = book
console.log(title+" "+ author); 

const profile = {
		name:"sam",
		profession:"Engineer",
		age:40
};
const {name, age} = profile
console.log(name)
console.log(age)





