Proceso ejercicio7uno
	Definir user Como Entero
	Definir contraseņa Como Entero
	Repetir
		Escribir "Introduce usuario"
		Leer user
		Si user<>1 Entonces
			Repetir 
				Escribir "Usuario incorrecto, vuelva a intentarlo"
				Leer user
			Hasta Que user=1
		FinSi
		Escribir "Introduce la contraseņa"
		Leer contraseņa
		Si contraseņa <> 1234 Entonces
			Repetir 
				Escribir "Contraseņa incorrecta, vuelva a intentarlo"
				Leer contraseņa
			Hasta Que contraseņa = 1234
		FinSi		
	Hasta Que user=1 y contraseņa=1234
	Escribir "Bienvenido"
FinProceso
