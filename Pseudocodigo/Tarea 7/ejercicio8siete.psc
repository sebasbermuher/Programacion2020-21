// A partir del ejemplo que dibuja un rectángulo de asteriscos, crea un que dibuje un cuadrado (deberá pedir sólo un dato, el lado 
//y ambas órdenes "para" deberán tener ese valor como límite).

Proceso ejercicio8siete
	Definir lado como Entero
	Definir fila como Entero
	Definir columna como Entero
	Escribir Sin Saltar "Introduce el lado: "
	Leer lado
	Para fila<-1 Hasta lado Hacer
		Para columna <- 1 Hasta lado Hacer
			Escribir Sin Saltar "*" ;
		FinPara
		Escribir "";
	FinPara
FinProceso
