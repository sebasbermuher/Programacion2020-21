//Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos). 
//A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7.
//Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.

Proceso ejercicio4
    Definir array, i, resp Como Entero
    definir numAzar Como Entero
    Dimension numAzar[401]
    
    Para i<-1 Hasta 20 Con Paso 1 Hacer
		numAzar[i]<-(azar(401))
        Escribir i+1,"º número: ",numAzar[i]
    FinPara
    
    Escribir Sin Saltar "¿Quiere saber los múltiplos de 5 [tecla 5] o los múltiplos de 7 [tecla 7]?"
    Leer resp
    Si resp=5 Entonces
        Para i<-1 hasta 20 con paso 1 hacer
            Si numAzar[i]%5=0 Entonces
                Escribir "[",numAzar[i],"]"
            FinSi
        FinPara
    SiNo
        Si resp=7 Entonces
            Para i<-1 Hasta 20 Con Paso 1 Hacer
                Si numAzar[i]%7=0 Entonces
                    Escribir "[",numAzar[i],"]"
                FinSi
            FinPara
        FinSi
    FinSi
FinProceso
