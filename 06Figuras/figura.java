import java.util.Scanner;
import java.lang.Math;

public class figura {

    double lado, altura, area, perimetro, lado2, lado3, base;
    int opcion;
    char letra;
    boolean comprobacion;
    Scanner entrada = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("Programa para el calculo de area y perimetro de figuras");
            System.out.println("Elija una opcion deseada: ");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            System.out.println("5.- Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    calcularCuadrado();

                    break;
                case 2:
                    calcularTriangulo();
                    break;
                case 3:
                    calcularCirculo();
                    break;
                case 4:
                    calcularRectangulo();
                    break;
                default:
                    System.out.println("Gracias por ocupar este programa saluditos");
                    break;
            }
            System.out.println("¿Desea repetir el programa?, escriba S para repetir ");
            letra = entrada.next().charAt(0);

        } while (letra == 's' || letra == 'S');
    }

    public void calcularCuadrado() {
        comprobacion = true;
        while (comprobacion) {

            try {

                entrada.nextLine();
                System.out.println("Ingrese el valor del lado del cuadrado: ");
                lado = entrada.nextDouble();
                perimetro = lado * 4;
                area = lado * lado;
                System.out.println("El perimetro es de: " + perimetro + " el area es de: " + area);

                comprobacion = false;
            } catch (Exception e) {
                System.out.println("**Ingrese unicamente valores numericos**");

            }
        }
    }

    public void calcularTriangulo() {

        comprobacion = true;
        while(comprobacion){
            try{
                entrada.nextLine();
        System.out.println("ingrese 1 para el area y 2 para el perimetro : ");
        opcion = entrada.nextInt();
        comprobacion = false;
            }catch(Exception e){
                System.out.println("***ingrese la opcion correspondiente***");
            }
        }


        switch (opcion) {
            case 1:

                comprobacion = true;
                while (comprobacion) {

                    try {

                        entrada.nextLine();
                        System.out.println("Ingresa la base del triangulo: ");
                        base = entrada.nextDouble();
                        System.out.println("Ingrese la altura del triangulo: ");
                        altura = entrada.nextDouble();
                        area = (base * altura) / 2;
                        System.out.println("El area del triangulo es: " + area);

                        comprobacion = false;
                    } catch (Exception e) {
                        System.out.println("***Ingrese unicamente valores numericos***");

                    }
                }
                break;

            case 2:
                comprobacion = true;
                while (comprobacion) {
                    try {
                        entrada.nextLine();
                        System.out.println("ingrese el primer lado: ");
                        lado = entrada.nextDouble();
                        System.out.println("ingrese el segundo lado: ");
                        lado2 = entrada.nextDouble();
                        System.out.println("ingrese el tercer lado: ");
                        lado3 = entrada.nextDouble();
                        perimetro = lado + lado2 + lado3;
                        System.out.println("el perimetro es : " + perimetro);
                        comprobacion = false;
                    } catch (Exception e) {
                        System.out.println("***Ingrese unicamente valores numericos***");

                    }
                }
                break;
            default:
                System.out.println("Opcion invalida ayoss");
                break;
        }
    }

    public void calcularCirculo() {
        comprobacion = true;
        while (comprobacion) {
            try {
                entrada.nextLine();
                System.out.println("ingrese 1 para el area y 2 para el perimetro : ");
                opcion = entrada.nextInt();
                comprobacion = false;
            } catch (Exception e) {
                System.out.println("***ingrese la opcion correspondiente***");
                

            }
        }

        switch (opcion) {
            case 1:
                comprobacion = true;
                while (comprobacion) {
                    try {
                        entrada.nextLine();
                        System.out.println("Ingresa el radio del circulo: ");
                        lado = entrada.nextDouble();

                        area = Math.PI * lado * lado;
                        System.out.println("El area es de: " + area);
                        comprobacion = false;
                    } catch (Exception e) {
                        System.out.println("***Ingrese unicamente valores numericos***");

                    }
                }

                break;

            case 2:
                comprobacion = true;
                while (comprobacion) {
                    try {
                        entrada.nextLine();
                        System.out.println("Ingrese el diametro del circulo: ");
                        lado = entrada.nextDouble();

                        perimetro = Math.PI * lado;
                        System.out.println("El perimetro es de : " + perimetro);
                        comprobacion = false;
                    } catch (Exception e) {
                        System.out.println("***Ingrese unicamente valores numericos***");

                    }
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }

    public void calcularRectangulo() {
        comprobacion = true;
        while(comprobacion){
            try{
        entrada.nextLine();
        System.out.println("ingrese 1 para el area y 2 para el perimetro : ");
        opcion = entrada.nextInt();
        comprobacion = false;
        }catch(Exception e){
            System.out.println("***ingrese la opcion correspondiente***");

        }
    }

        switch (opcion) {
            case 1:
                comprobacion = true;
                while (comprobacion) {
                    try {
                        entrada.nextLine();
                        System.out.println("Ingrese la base del rectangulo: ");
                        base = entrada.nextDouble();
                        System.out.println("ingrese la altura: ");
                        altura = entrada.nextDouble();
                        area = base * altura;
                        System.out.println("El area del perimetro es: " + area);
                        comprobacion = false;
                    } catch (Exception e) {
                        System.out.println("***Ingrese unicamente valores numericos***");

                    }
                }
                break;
            case 2:
                comprobacion = true;
                while (comprobacion) {
                    try {
                        entrada.nextLine();
                        System.out.println("Ingrese la base del rectangulo: ");
                        base = entrada.nextDouble();
                        System.out.println("ingrese la altura: ");
                        altura = entrada.nextDouble();
                        perimetro = base + base + altura + altura;
                        System.out.println("El perimetro es: " + perimetro);
                        comprobacion = false;
                    } catch (Exception e) {
                        System.out.println("***Ingrese unicamente valores numericos***");

                    }
                }
                break;

        }

    }

}