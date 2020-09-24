Proceso ejercicio7uno
	Definir user Como Entero
	Definir contraseña Como Entero
	Repetir
		Escribir "Introduce usuario"
		Leer user
		Si user<>1 Entonces
			Repetir 
				Escribir "Usuario incorrecto, vuelva a intentarlo"
				Leer user
			Hasta Que user=1
		FinSi
		Escribir "Introduce la contraseña"
		Leer contraseña
		Si contraseña <> 1234 Entonces
			Repetir 
				Escribir "Contraseña incorrecta, vuelva a intentarlo"
				Leer contraseña
			Hasta Que contraseña = 1234
		FinSi		
	Hasta Que user=1 y contraseña=1234
	Escribir "Bienvenido"
FinProceso
