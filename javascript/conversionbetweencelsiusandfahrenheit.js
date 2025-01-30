function celsiusToFahrenheit(celsius) {
    return (celsius * 9 / 5) + 32;
}

function fahrenheitToCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
}

let fahrenheit = 120.0;
let celsius = 40.0;

console.log(`${celsius} Celsius is equal to ${celsiusToFahrenheit(celsius)} Fahrenheit`);
console.log(`${fahrenheit} Fahrenheit is equal to ${fahrenheitToCelsius(fahrenheit)} Celsius`);


