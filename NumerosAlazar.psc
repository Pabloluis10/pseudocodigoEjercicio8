Algoritmo NumerosAlazar
	
	Repetir
		Escribir "Se generaran multiplos del 5 aleatoriamente hasta que ingrese S"
		Num = 0;
		Repetir
			Num = Aleatorio(0, 1000000000000000000000000000)
			mult = Num%5; 
		Hasta Que Mult == 0
		Escribir "El número Aleatorio generado es: ", Num
		Escribir "desea salir (S)"
		leer desicion
	Hasta Que desicion == 'S'
	
FinAlgoritmo
