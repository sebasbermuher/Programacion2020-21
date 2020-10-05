// Crea un procedimiento EscribirCentrado, que reciba como parámetro un texto y lo escriba centrado en pantalla 
//(suponiendo una anchura de 80 columnas; pista: deberás escribir 40 - longitud/2 espacios antes del texto).

Funcion centrar(frase)	
	Definir i como Entero;
	Para i<-0 hasta (40 - (Longitud(frase)/2)) Hacer
		Escribir sin saltar " ";
	FinPara
	Escribir frase;
	Escribir "";
FinFuncion


Proceso EscribirCentrado
	Definir mensaje1 Como Caracter;
	Leer mensaje1
	centrar(mensaje1);
FinProceso