// Crea un programa que pida dos n�meros enteros al usuario y diga si alguno de ellos es m�ltiplo del otro. 
//Crea una funci�n EsMultiplo que te ayude a que el proceso principal sea legible.

Algoritmo ejercicio13dos
	Definir numero1,numero2 Como Entero;
	Escribir Sin Saltar "Escribe el primer n�mero:";
	Leer numero1;
	Escribir Sin Saltar "Escribe el segundo n�mero:";
	Leer numero2;
	Si EsMultiplo(numero1,numero2) Entonces
		Escribir numero1," es m�ltiplo de ",numero2;
	SiNo
		Escribir numero1," no es m�ltiplo de ",numero2;
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