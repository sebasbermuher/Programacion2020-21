Proceso ejercicio7uno
	Definir user Como Entero
	Definir contrase�a Como Entero
	Repetir
		Escribir "Introduce usuario"
		Leer user
		Si user<>1 Entonces
			Repetir 
				Escribir "Usuario incorrecto, vuelva a intentarlo"
				Leer user
			Hasta Que user=1
		FinSi
		Escribir "Introduce la contrase�a"
		Leer contrase�a
		Si contrase�a <> 1234 Entonces
			Repetir 
				Escribir "Contrase�a incorrecta, vuelva a intentarlo"
				Leer contrase�a
			Hasta Que contrase�a = 1234
		FinSi		
	Hasta Que user=1 y contrase�a=1234
	Escribir "Bienvenido"
FinProceso
