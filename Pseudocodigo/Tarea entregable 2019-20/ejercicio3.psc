//Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. 
//El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, 
//en caso contrario se debe mostrar un mensaje de error.

Proceso ejercicio3
	Definir altura,impr, k , m ,l , i , aux , j  como entero
	Escribir "Por favor, introduzca la altura del reloj de arena: "
		leer altura
		
		impr<-altura%2
		
		Si impr=1 Y altura>=3 Entonces
			Para k<-(altura-1) Hasta 1 Con Paso -2 Hacer //Esta parte es la superior del reloj
				Para m<-(altura-1)-k Hasta 0 Con paso -1 Hacer
					Escribir Sin Saltar " "
				FinPara
				Para l<-k Hasta 0 Con Paso -1 Hacer
					Escribir Sin Saltar" *"
				FinPara
				Escribir ""
			FinPara
			Para i<-0 Hasta altura con paso 2 Hacer // Esta parte es la inferior
				Para aux<-0 Hasta (altura-i) Hacer
					Escribir Sin Saltar " "
				FinPara
				Para j<-0 Hasta i Con Paso 1 Hacer
					Escribir Sin Saltar "* "
				FinPara
				Escribir ""
			FinPara
		SiNo
			Escribir "Por favor, introduzca un numero impar y mayor o igual a 3, Gracias"
		FinSi
FinProceso
