Proceso ejercicio4cuatro
	Definir numero1 Como Entero
	Definir numero2 Como Entero
	Escribir "Introduce un numero distinto a 0"
	Leer numero1
	Escribir "Introduce otro numero distinto a 0"
	Leer numero2
	Si numero1>0 y numero2>0 Entonces
		Escribir "Los dos son positivos"
	Sino 
		Si numero1<0 y numero2<0 Entonces
			Escribir "Los dos numeros son negativos"
		Sino 
			Si numero1>0 y numero2<0 Entonces
				Escribir "Solo un numero es positivo"
			SiNo
				si numero1<0 y numero2>0 Entonces
					Escribir "Solo un numero es positivo"
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso
