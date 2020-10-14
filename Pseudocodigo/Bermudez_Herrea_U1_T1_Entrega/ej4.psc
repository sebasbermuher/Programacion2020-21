//Realiza un programa que calcule el m�ximo, el m�nimo y la media de una serie de n�meros enteros positivos introducidos por teclado. 
//El programa terminar� cuando el usuario introduzca un n�mero primo. Este �ltimo n�mero no se tendr� en cuenta en los c�lculos. 
//El programa debe indicar tambi�n cu�ntos n�meros ha introducido el usuario (sin contar el primo que sirve para salir).
//Ejemplo:
//Por favor, vaya introduciendo n�meros enteros positivos. Para terminar, introduzca un n�mero primo:
	//6
	//8
	//15
	//12
	//23
	//Ha introducido 4 n�meros no primos.
	//M�ximo: 15
	//M�nimo: 6
	//Media: 10.25

Proceso ej4
	Definir num , maximo , minimo  Como Entero
	Escribir "Por favor, vaya introduciendo n�meros enteros positivos. Para terminar, introduzca un n�mero primo:"
	Leer num
	maximo =num
	minimo=num
	Mientras  num>=0 Hacer
		Leer num
		
		Si num > maximo Entonces
			maximo = num
		FinSi
		
		Si num<minimo y num>=0  Entonces
			minimo=num
		FinSi
		
	FinMientras
	
	Escribir "El maximo es: " maximo
	Escribir "El minimo es: " minimo
	
FinProceso
