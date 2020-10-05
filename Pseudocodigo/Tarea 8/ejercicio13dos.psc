// Crea un programa que pida dos números enteros al usuario y diga si alguno de ellos es múltiplo del otro. 
//Crea una función EsMultiplo que te ayude a que el proceso principal sea legible.

Algoritmo ejercicio13dos
	Definir numero1,numero2 Como Entero;
	Escribir Sin Saltar "Escribe el primer número:";
	Leer numero1;
	Escribir Sin Saltar "Escribe el segundo número:";
	Leer numero2;
	Si EsMultiplo(numero1,numero2) Entonces
		Escribir numero1," es múltiplo de ",numero2;
	SiNo
		Escribir numero1," no es múltiplo de ",numero2;
	FinSi
FinAlgoritmo

Funcion multiplo1 <- EsMultiplo(num1,num2)
	Definir multiplo1 Como Logico;
	Si num1 % num2 = 0 Entonces
		multiplo1 <- Verdadero;
	SiNo
		multiplo1 <- Falso;
	FinSi
FinFuncion