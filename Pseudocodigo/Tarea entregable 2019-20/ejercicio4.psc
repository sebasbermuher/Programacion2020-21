//Escribe un programa que rellene un array de 20 elementos con n�meros enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos). 
//A continuaci�n el programa mostrar� el array y preguntar� si el usuario quiere resaltar los m�ltiplos de 5 o los m�ltiplos de 7.
//Seguidamente se volver� a mostrar el array escribiendo los n�meros que se quieren resaltar entre corchetes.

Proceso ejercicio4
    Definir array, i, resp Como Entero
    definir numAzar Como Entero
    Dimension numAzar[401]
    
    Para i<-1 Hasta 20 Con Paso 1 Hacer
		numAzar[i]<-(azar(401))
        Escribir i+1,"� n�mero: ",numAzar[i]
    FinPara
    
    Escribir Sin Saltar "�Quiere saber los m�ltiplos de 5 [tecla 5] o los m�ltiplos de 7 [tecla 7]?"
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
