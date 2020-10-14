//Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos introducidos por teclado. 
//El programa terminará cuando el usuario introduzca un número primo. Este último número no se tendrá en cuenta en los cálculos. 
//El programa debe indicar también cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
//Ejemplo:
//Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:
	//6
	//8
	//15
	//12
	//23
	//Ha introducido 4 números no primos.
	//Máximo: 15
	//Mínimo: 6
	//Media: 10.25

Proceso ej4
	Definir num , maximo , minimo  Como Entero
	Escribir "Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:"
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
