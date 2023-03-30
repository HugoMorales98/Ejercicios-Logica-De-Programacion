// Solicitar por prompt tres datos y guardarlos en sus respectivas variables
let num1 = parseFloat(prompt("Introduce el primer número:"));
let num2 = parseFloat(prompt("Introduce el segundo número:"));
let num3 = parseFloat(prompt("Introduce el tercer número:"));

// Verificar que los valores introducidos son números
if (isNaN(num1) || isNaN(num2) || isNaN(num3)) {
  console.log("Por favor, introduce valores numéricos válidos");
} else {
  // Ordenar los números de mayor a menor y mostrarlos por consola
  let numMayor, numCentro, numMenor;

  if (num1 >= num2 && num1 >= num3) {
    numMayor = num1;
    numCentro = Math.max(num2, num3);
    numMenor = Math.min(num2, num3);
  } else if (num2 >= num1 && num2 >= num3) {
    numMayor = num2;
    numCentro = Math.max(num1, num3);
    numMenor = Math.min(num1, num3);
  } else {
    numMayor = num3;
    numCentro = Math.max(num1, num2);
    numMenor = Math.min(num1, num2);
  }

  document.getElementById("mensaje").innerHTML = "Números ordenados de mayor a menor: " + numMayor + ", " + numCentro + ", " + numMenor + "<br>";
  document.getElementById("mensaje").innerHTML += "Números ordenados de menor a mayor: " + numMenor + ", " + numCentro + ", " + numMayor;

  if (num1 === num2 && num2 === num3) {
    document.getElementById("mensaje").innerHTML += "<br>Los tres números son iguales";
  }
}
