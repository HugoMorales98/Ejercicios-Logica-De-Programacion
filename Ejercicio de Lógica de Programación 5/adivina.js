let secretNumber = Math.floor(Math.random() * 100) + 1;
let numbers = [];

while (true) {
  let input = prompt("Ingresa un número del 1 al 100 para adivinar el número secreto:");

  if (isNaN(input) || input < 1 || input > 100) {
    alert("Debes ingresar un número del 1 al 100.");
    continue;
  }

  let number = parseInt(input);

  numbers.push(number);

  if (number === secretNumber) {
    alert("¡Felicidades, adivinaste el número secreto!");
    console.log("Lista de números introducidos: " + numbers.join(", "));
    break;
  } else {
    alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
  }
}