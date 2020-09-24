Proceso ejercicio4seis
	Definir x1 Como Entero
	Definir x2 Como Entero
	Definir x3 Como Entero
	Escribir "Introduce 3 numeros"
	Leer x1
	Leer x2
	Leer x3
	Si x1>x2 y x1>x3 Entonces
		Escribir "El primer numero es el mayor"
	SiNo
		Si x2>x1 y x2>x3 Entonces
			Escribir "El segundo numero es el mayor"
		SiNo
			Si x3>x1 y x3>x2 Entonces
				Escribir "El tercer numero es el mayor"
			SiNo
				Escribir "Hubo un error. No introduzca dos numeros iguales"	
			Finsi
		FinSi
	FinSi
	
FinProceso
