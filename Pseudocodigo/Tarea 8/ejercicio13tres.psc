Algoritmo ejercicio13tres
	Escribir "Introduce un numero"
	Definir num Como Entero
	Leer num
	Escribir EsPar(num)
FinAlgoritmo

Funcion resultado <- Espar(num)
	Definir resultado como logico
	
	Si num%2=0 Entonces 
		resultado <- Verdadero 
	SiNo
		resultado <- Falso
	FinSi
FinFuncion

