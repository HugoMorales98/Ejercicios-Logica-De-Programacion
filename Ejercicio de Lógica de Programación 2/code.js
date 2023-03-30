// Solicitamos al usuario que ingrese la temperatura en grados Celsius y la almacenamos en la variable "celsius"
let celsius = parseFloat(prompt("Ingresa la temperatura en grados Celsius:"));

// Verificamos si el valor ingresado es un número, si no lo es, mostramos un mensaje de error y volvemos a solicitar el valor
while (isNaN(celsius)) {
  celsius = parseFloat(prompt("Por favor, ingresa un valor numérico para la temperatura en grados Celsius:"));
}

// Convertimos la temperatura de grados Celsius a grados Fahrenheit y la almacenamos en la variable "fahrenheit"
let fahrenheit = (celsius * 1.8) + 32;

// Convertimos la temperatura de grados Celsius a grados Kelvin y la almacenamos en la variable "kelvin"
let kelvin = celsius + 273.15;

// Mostramos por consola la temperatura convertida en grados Fahrenheit y en grados Kelvin
console.log("Grados Fahrenheit: " + fahrenheit);
console.log("Grados Kelvin: " + kelvin);

// Mostramos los resultados en el DOM
let resultadoFahrenheit = document.createElement("p");
resultadoFahrenheit.textContent = "Grados Fahrenheit: " + fahrenheit;
document.body.appendChild(resultadoFahrenheit);

let resultadoKelvin = document.createElement("p");
resultadoKelvin.textContent = "Grados Kelvin: " + kelvin;
document.body.appendChild(resultadoKelvin);