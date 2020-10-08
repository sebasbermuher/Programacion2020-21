//Escribe un programa que cambie un dígito dentro de un número dando la posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha empezando por el 1.
//Ejemplo:	
//Por favor, introduzca un número entero positivo: 123456
//Introduzca la posición dentro del número: 5
//Introduzca el nuevo dígito: 7
//El número resultante es 123476
//NOTA: Una pista, utilizar las funciones para texto que nos proporciona pseint

Proceso ejercicio2
	definir num Como Caracter
	definir posicion Como entero
	definir numNuevo Como Caracter
	definir i Como entero
	Escribir "Escribe un numero positivo"
	leer num
	Escribir "Intoduzca la posicion dentro del nuemero"
	leer posicion
	Escribir "Escribe un nuevo digito"
	leer numNuevo
	
	Para i = 0 hasta Longitud(num)
		si i = posicion -1 Entonces
			Escribir Sin Saltar  numNuevo
		SiNo
			escribir Sin Saltar Subcadena(num, i, i)
		FinSi
	FinPara
FinProceso