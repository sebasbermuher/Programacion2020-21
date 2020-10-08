Proceso sin_titulo
	Definir altura , i , j , k Como Entero;
	Leer altura
	Para i<-0 Hasta altura-1 Con Paso 1 Hacer
		Para j<-0 hasta altura-1 Con Paso 1 Hacer
			si (j>=i y j < (altura-i)) o (i>altura/2 y j<=i y j>= (altura-i-1)) Entonces
				escribir Sin Saltar "*"
			SiNo
				Escribir Sin Saltar " "
			FinSi
		FinPara
		Escribir ""
	FinPara
FinProceso
