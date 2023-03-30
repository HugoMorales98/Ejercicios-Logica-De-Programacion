let num;

do {
  num = prompt("Introduce un número:");

  // Verificar si el valor ingresado es un número
  if (isNaN(num)) {
    alert("Por favor, introduce un número válido");
  }
} while (isNaN(num));

let factorial = 1;

for (let i = 1; i <= num; i++) {
  factorial *= i;
}

let resultadoDiv = document.getElementById("resultado");
resultadoDiv.innerHTML = `El factorial de ${num} es ${factorial}`;