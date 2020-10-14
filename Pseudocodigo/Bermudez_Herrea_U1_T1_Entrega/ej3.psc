//Nos han encargado realizar un programa que pinte un 8 por pantalla usando la letra M. Se pide al usuario la altura, 
//que debe ser un número entero impar mayor o igual que 5. Si el número introducido no es correcto, el programa deberá mostrar 
//un mensaje de error y volver a solicitarlo. A continuación se muestran algunos ejemplos.
//La anchura de la figura siempre será de 6 caracteres.
//Ejemplo 1:
//Por favor, introduzca la altura (número impar mayor o igual a 5): 8
//La altura introducida no es correcta
//Ejemplo 2:
//Por favor, introduzca la altura (número impar mayor o igual a 5): 3
//La altura introducida no es correcta
//Ejemplo 3:
//Por favor, introduzca la altura (número impar mayor o igual a 5): 7
	//MMMMMM
	//M    M
	//M    M
	//MMMMMM
	//M    M
	//M    M
	//MMMMMM
Proceso ej3
    Definir altura, x Como Entero
	Escribir "Introduzca la altura (número impar mayor o igual a 5)"
	Leer altura
	//Mientras la altura sea par y menor que 5 o altura par y mayor o igual a 5, volverá a pedir un numero valido
	Mientras altura %2=0 y altura <5 o altura%2=0 y altura >=5 Hacer
		Escribir "Por favor, introduzca la altura (número impar mayor o igual a 5)"
		Leer altura
	FinMientras
	
	Para x=1 Hasta altura Hacer
		si x=1 o x=redon(altura/2) o x=altura Entonces
			Escribir Sin Saltar "MMMMMM"
		SiNo
			Escribir Sin Saltar "M    M"
		FinSi
        Escribir ""
    FinPara	
FinProceso