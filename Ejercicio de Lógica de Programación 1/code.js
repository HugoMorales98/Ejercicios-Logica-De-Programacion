// Solicitar por prompt tres datos y guardarlos en sus respectivas variables
let num1 = parseFloat(prompt("Introduce el primer número:"));
let num2 = parseFloat(prompt("Introduce el segundo número:"));
let num3 = parseFloat(prompt("Introduce el tercer número:"));

// Ordenar los números de mayor a menor y mostrarlos por consola
console.log("Números ordenados de mayor a menor: " + Math.max(num1, num2, num3) + ", " + Math.min(Math.max(num1, num2), Math.max(num2, num3), Math.max(num1, num3)) + ", " + Math.min(num1, num2, num3));

// Ordenar los números de menor a mayor y mostrarlos por consola
console.log("Números ordenados de menor a mayor: " + Math.min(num1, num2, num3) + ", " + Math.min(Math.max(num1, num2), Math.max(num2, num3), Math.max(num1, num3)) + ", " + Math.max(num1, num2, num3));

// Mostrar un mensaje si los números son iguales
if (num1 === num2 && num2 === num3) {
  console.log("Los tres números son iguales");
}