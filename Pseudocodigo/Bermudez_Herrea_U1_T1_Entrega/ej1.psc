Proceso ej1
	Definir cantidad Como Entero
	Escribir "Introduzca la cantidad de unidades"
	Leer cantidad
	Si cantidad <= 100 Entonces
		Escribir "El precio del pedido es: " cantidad*5.23 " euros.";
		SiNo
			Si cantidad >=101 o cantidad <=1000 entonces
				Escribir "El precio del pedido es: " 100*5.23+(cantidad-100)*4.16 " euros.";
			Sino
				Si cantidad >= 1001 Entonces
					Escribir "El precio del pedido es " cantidad * (5.23 / 2) " euros.";
				FinSi
			Finsi
	Finsi
FinProceso

