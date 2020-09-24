Proceso ejercicio6tres
	Escribir "Resuelva la suma de los siguientes numeros aleatorios"
	Definir  num1 Como Entero
	Definir num2 Como Entero 
	definir resul como entero
	num1 <- azar(101)
	num2 <- azar(101)
	Escribir num1 
	Escribir num2
	Leer resul
	Mientras resul <> (num1 + num2) Hacer
		Escribir "El resultado de la suma es incorrecta. Vuelva a intentarlo"
		Leer resul
	FinMientras
	Escribir "Enhorabuena, el resultado es el correcto"
FinProceso
