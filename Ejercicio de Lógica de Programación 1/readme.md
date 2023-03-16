# Descripción del Código
## Instrucciones
- El siguiente programa en JavaScript solicita al usuario que ingrese tres números y los almacena en tres variables distintas. A continuación, los ordena de mayor a menor y de menor a mayor, y los muestra en consola.

- Si los tres números son iguales, el programa también muestra un mensaje en consola para informar al usuario.

## Consideraciones
- Para ejecutar el código es necesario contar con un entorno de desarrollo que permita la ejecución de JavaScript, como un navegador web o un programa especializado.

- Al solicitar los números al usuario, se convierten a tipo float mediante la función parseFloat() para poder realizar comparaciones numéricas más adelante.

- Para verificar que los valores ingresados sean números válidos, se utiliza la función isNaN() para comprobar si alguna de las variables no es un número.

- Se utiliza una serie de condicionales if y else if para determinar cuál de los tres números es el mayor y cuál es el menor. Luego, se asignan a tres variables distintas en orden, utilizando las funciones Math.max() y Math.min() para determinar el número central.

- Finalmente, se muestran los números ordenados de mayor a menor y de menor a mayor en consola, utilizando la función console.log(). Si los tres números son iguales, se muestra un mensaje adicional en consola.