Proceso ejercicio7tres
	definir num1 Como Entero
	Definir num2 Como entero
	Escribir "Introduce un numero"
	Leer num1
	Escribir "Introduce otro numero"
	Repetir
		Leer num2
		Si num2=0 Entonces
			Escribir "Has introducido 0. Prueba con otro numero"
		FinSi
	Hasta Que num2<>0
	Escribir "El resultado de la division es " num1 / num2
FinProceso
