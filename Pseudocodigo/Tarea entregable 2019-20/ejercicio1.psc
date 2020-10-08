//Escribe un algoritmo que calcule el sueldo semanal de un trabajador teniendo en cuenta lo siguiente:
//-> El sueldo para las primeras 40 horas es 10
//-> A partir de la hora 41 (incluida) el trabajado cobrará 15 hora
//Por ejemplo:
//Introduzca el número de horas trabajadas durante la semana: 36
//El sueldo semanal que le corresponde es de 360
//Introduzca el número de horas trabajadas durante la semana: 50
//El sueldo semanal que le corresponde es de 550

Proceso ejercicio1
	Definir num_horas Como Entero
	Escribir "Introduzca las horas trabajadas"
	Leer num_horas
	Si num_horas <= 40 Entonces
		Escribir "El sueldo semanal que le corresponde por trabajar " num_horas " horas es de " num_horas*10 " euros.";
	SiNo
		Escribir "El sueldo semanal que le corresponde por trabajar " num_horas " horas es de " 40*10+(num_horas-40)*15;
	FinSi
FinProceso