//Escribe un programa que si le pasamos un entero nos devuelva ese entero al revés
//Ejemplo:
//Por favor, introduzca un número entero positivo: 123456
//El número resultante es 654321
//NOTA: No se pueden utilizar funciones de texto de PseInt.

Proceso ej2
	Definir num , x ,r Como Entero
	Escribir "Introduzca un numero entero positivo:"
	Leer num
	x = 0
	r = 0
	Mientras num > 0 Hacer
		r = num % 10
		x = x * 10 + r 
		num = trunc(num / 10)
	FinMientras
	Escribir x
	FinProceso
