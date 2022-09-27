/**Vamos a crear los 14 programas dentro de un menu de seleccion de la tarea, comprendido por:
 * 1.- Bono o descuento por edad
 * 2.- Convertir numeros decimales a binarios
 * 3.- convertir temperaturas
 * 4.- Numero de positivos y negativos
 * 5.- Tienda
 * 6.- Area y Perimetro
 * 7.- Tabla
 * 8.- Factorial
 * 9.- Dibujitos
 * 10.- Figura hueca
 * 11.- Patrones
 * 12.- Diamante
 * 13.- Calculadora
 * 14.- Salir
 */

import java.util.Scanner;

class EstructuraDatos {

    public static void main(String[] args){
        try (//objetos
        Scanner entrada = new Scanner(System.in)){
            //aqui van a ir las variables
            float  num,costo, cantidad, acumulador,total=0 ,articulosTotal=0;
            int opcion, numbinario, edad, opcion1,  cneg=0 ,cpos=0, cneutro=0, Descuento=0, numeroF=0, Factorial=1,ladoo=0;
            char letra,articulo;
            String binario = "" ;
            double  farenheit, centigrados, grados,Rankine,kelvin, k=273.15;
            
            do{
                System.out.println("Bienvenido al programa de las tareas que son para el lunes a las 7 am wiii (n_n)/");
                System.out.println("Por favor elija la opcion deseada: ");
                System.out.println("1.- Descuento por edad ");
                System.out.println("2.- Convertir numero decimal a binario ");
                System.out.println("3.- Conversiones de temperatura ");
                System.out.println("4.- Numeros Positivos y Negativos ");
                System.out.println("5.- Tienda ");
                System.out.println("6.- Area y Perimetro ");
                System.out.println("7.- Tabla ");
                System.out.println("8.- Factorial ");
                System.out.println("9.- Dibujos de codigo ");
                System.out.println("10.- Figura Hueca ");
                System.out.println("11.- Patrones de Codigo ");
                System.out.println("12.- Diamante ");
                System.out.println("13.- Calculadora ");
                System.out.println("14.- Salir ");

                //obtener la respuesta del usuario
                opcion = entrada.nextInt();

                //menu
                switch(opcion){
                    case 1:
                    System.out.println("Six Flags Mexico");
                    System.out.println("ingrese Su edad: ");
                    edad = entrada.nextInt();
                    {if(edad > 65){
                    System.out.println("se le aplica un descuento del 40%");
                    }else{
                        System.out.println("no se aplica ningun descuento");
                    
                    }if(edad <= 21){
                        System.out.println("¿sus padres son socios?");
                        System.out.println("1.-SI 2.-NO");
                        Descuento = entrada.nextInt();
                    }if(Descuento == 2){
                        System.out.println("Se te hace un descuento del 25%");
                     }if(Descuento == 1){
                    System.out.println("Se te aplico un descuento del 45%");
                    }
                   
                    }
                    break;
                    

                    case 2:
                        //convertir numero a binario
                        System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                        numbinario = entrada.nextInt();

                        //tenemos que saber si es positivo
                        if(numbinario > 0){
                            //realizar el algotimo con el mod 2 
                            while(numbinario > 0){
                                if(numbinario%2 == 0){
                                    binario ="0" + binario;
                                }else{
                                    binario ="1" + binario;
                                }
                                numbinario = (int)numbinario/2;
                            }
                        }else if(numbinario == 0){
                            binario = "0";
                        }else{
                            binario = "No se pudo convertir el numero, ingrese solo positivos";
                        }
                        System.out.println("El numero convertido a binario es: " + binario);
                        break;
                    case 3:  
                        System.out.println("Seleccione en que ingresara los grados");
                        System.out.println("1.-para farenheit");
                        System.out.println("2.-Para centigrados");
                        System.out.println("3.-Para Kelvin");
                        System.out.println("4.-Para Rankine");

                    opcion1 = entrada.nextInt();
                    switch(opcion1){   
                    case 1:
                    System.out.println("Escribir los grados");
                    grados = entrada.nextFloat();
                    farenheit=((grados*9/5)+32);    
                    System.out.println("La conversion a farenheit es:" + farenheit);
                    break;
                    case 2:
                    System.out.println("Escribir los grados");
                    grados = entrada.nextFloat();
                    centigrados=(grados-32)*5/9;
                    System.out.println("La conversion a centigrados es:" + centigrados);
                        break;
                    case 3:
                    System.out.println("Escribir los grados");
                    grados = entrada.nextFloat();
                    kelvin = (grados+k);
                    System.out.println("La conversion a centigrados es:" + kelvin + " k");
                    break;
                    case 4:
                    System.out.println("Escribir los grados");
                    grados = entrada.nextFloat();
                    Rankine = grados*9/5+491.67;
                    System.out.println("La conversion a centigrados es:" + Rankine);



                    }
                    break;
                    case 4:
                    for(int n = 1; n<=5; n++){
                    System.out.println("Ingrese un Numero: "); 
                    num = entrada.nextFloat();
                     
                     if (num > 0){ 
                        System.out.println("Su Numero  " + num +"  es positivo");
                        cpos++;
                        
                    }else if( num == 0){
                      System.out.println("El numero  "+ num + "  es Neutro");
                      cneutro++;

                    }if(num < 0){
                        System.out.println("Su Numero  " + num +"  es negativo");
                        cneg++;
                    }
                    }
                    System.out.println("La cantidad de numero positivos son: "+cpos);
                    System.out.println("La cantidad de numero Negativos son: "+cneg);
                    System.out.println("La cantidad de numero Neutros son: "+cneutro);
                    
                

                        break;    
                    case 5:
                    System.out.println("*****Tienda*****");
                    do{
                        System.out.println("Nombre del articulo");
                        articulo = entrada.next().charAt(0);
                        System.out.println("costo");
                        costo = entrada.nextFloat();
                        System.out.println("cantidad del producto");
                        cantidad = entrada.nextFloat(); 
                        acumulador = costo*cantidad;
                        total = total+acumulador;
                        articulosTotal = articulosTotal+cantidad;

                        System.out.println("¿quiere realizar otra compra?1.-SI 2.-NO");
                        num = entrada.nextFloat();
                
                    }while(num == 1);
                
                    
                    System.out.println();
                    System.out.println("numero de articulos comprados: " + articulosTotal);
                    System.out.println("costo en total: " + total);
                        break;
                    case 6:
                    
                    case 7:
                        for(int n = 1; n<=10; n++){
                            System.out.println(n + " " +(n*10) + " " + (n*100) + " " +(n*1000) );
                        }
                        break;
                    case 8:
                    System.out.println("Dame un Numero entero: ");
                    numeroF = entrada.nextInt();
                    while(numeroF != 0){
                        Factorial *= numeroF;
                        numeroF --;
                    }
                    System.out.println("El facotorial es: "+Factorial);

                    
                        break;
                    case 9:
                    System.out.println("inserte un numero para el cuadrado");
                    ladoo = entrada.nextInt();
                    for(int i=0; i<ladoo;i++) {
                        for(int j=0;j<ladoo;j++) {
                            System.out.print("* ");                            
                            
                        }
                        System.out.println();
                    }
                    
                    
                
                    break;
                }

                System.out.println("Deseas repetir el programa, escribe s para si");
                letra = entrada.next().charAt(0);
                



            }while(letra == 's' || letra == 'S' );
        }

    }
    
}