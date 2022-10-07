Algoritmo algoritmos
	Escribir "1.- Triangulo";
	Escribir "2.- Cilindro";
	Escribir "3.- Sumatoria";
	Escribir "4.- Mayor o menor";
	Leer op
	Segun(op) hacer
		caso 1:
			Escribir "Ingrese el lado 1:"
			Leer l1
			Escribir "Ingrese el lado 2:"
			Leer l2
			Escribir "Ingrese el lado 3:"
			Leer l3
			
			Definir cat1,cat2,hip Como Real
			Si l1>l2 Entonces
				cat1<-l2
				Si l1>l3 Entonces
					hip<-l1
					cat2<-l3
				SiNo
					hip<-l3
					cat2<-l1
				FinSi
			SiNo
				cat1<-l1
				Si l2>l3 Entonces
					hip<-l2
					cat2<-l3
				SiNo
					hip<-l3
					cat2<-l2
				FinSi
			FinSi
			
			// ver si cumple con Pitagoras
			Si hip^2 = cat1^2 + cat2^2 Entonces
				Definir area como real
				area<-(cat1*cat2)/2
				Escribir "El area es: ",area
			SiNo
				Escribir "No es un triangulo rectangulo."
			FinSi
		Caso 2:
			Escribir "Ingrese el radio: "
			Leer radio
			Escribir "Ingrese la altura: "
			Leer altura
			area =  pi*pi*radio*altura + pi*pi*radio*radio
			volumen = pi*radio*radio*altura
			Escribir "El area del cilindro es: ", area;
			Escribir "El volumen del cilindro es:",volumen;
		caso 3:
			suma <- 0
			para i<-1 Hasta 10 Con Paso 1 Hacer
				suma <- suma+i
				
			FinPara
			Escribir "la sumatoria de los numero es: ",suma
		caso 4:
			Escribir"Ingresa un numero"
			leer a,b,c
			si a > b  y a > c Entonces
				Escribir "el numero es mayor", a
			SiNo
				si b > a y b > c Entonces
					Escribir " el segundo es mayor", b
				SiNo
					si c>a y c>b Entonces
						Escribir "el tercero es mayor", c
					SiNo
					FinSi
				FinSi
			FinSi
			si a < b  y a < c Entonces
				Escribir "el primero es menor", a
			SiNo
				si b < a y b < c Entonces
					Escribir " el segundo es menor", b
				SiNo
					si c<a y c<b Entonces
						Escribir "el tercero es menor", c
					SiNo
					FinSi
				FinSi
			FinSi
			si a = b  o a = c Entonces
				Escribir "opcion no valida se repite en la primera",a
			SiNo
				si b = a o b = c Entonces
					Escribir "opcion no valida se repite en la segunda",b
				SiNo
					si c=a o c=b Entonces
						Escribir "opcion no valida se repite en la tercera", c
					SiNo
					FinSi
				FinSi
			FinSi
		De Otro Modo:
			Escribir "opcion no valida"
			
	Fin Segun
	
FinAlgoritmo

