// Solicitar por prompt un número y guardarlo en una variable
let num = parseInt(prompt("Introduce un número:"));

// Verificar que el valor introducido es un número
if (isNaN(num)) {
    (prompt("Por favor, introduce un valor numérico válido"));
} else {
  // Crear un arreglo para guardar la serie de Fibonacci
  let fibonacci = [];

  // Calcular la serie de Fibonacci
  for (let i = 0; i < num; i++) {
    if (i < 2) {
      fibonacci.push(i);
    } else {
      fibonacci.push(fibonacci[i - 1] + fibonacci[i - 2]);
    }
  }

  // Imprimir la serie de Fibonacci por consola y en el DOM
  console.log(fibonacci);
  let output = document.getElementById("output");
  output.innerHTML = fibonacci.join(", ");
}