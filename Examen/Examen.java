import java.util.Scanner;

class Examen {
    public static int[][] JugadorUno = new int[8][8];
    public static int[][] JugadorDos = new int[8][8];

    public static void main(String[] args) {
        int posX = 0;
        int posY = 0;
        int Barcos = 0;
        boolean comprobacion = true;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("\t\t~~Batalla naval~~");
        System.out.println("");

        do {
            comprobacion = true;
            while (comprobacion) {
                try {

                    System.out.println("**************************************************");
                    System.out.print("  \tJugador 1 - Barco " + (Barcos + 1) + ": Posicion X:");
                    posX = Entrada.nextInt();
                    System.out.println("\n**************************************************");
                    if (posX <= 8 && posX >= 0) {
                        comprobacion = false;
                    } else {
                        System.out.println("\tFuera de rango");
                        System.out.println("\tDel 1 al 8");
                    }
                } catch (Exception e) {
                    Entrada.nextLine();
                    System.out.println("\tIngrese valor numerico");
                }
            }
            comprobacion = true;
            while (comprobacion) {
                try {

                    System.out.println("\n**************************************************");
                    System.out.print("\tJugador 1 - Barco " + (Barcos + 1) + ": Posicion Y:");
                    posY = Entrada.nextInt();
                    System.out.println("\n**************************************************");
                    if (posY <= 8 && posY >= 0) {
                        comprobacion = false;
                    } else {
                        System.out.println("\tFuera de rango");
                        System.out.println("\tDel 1 al 8 ");
                    }
                } catch (Exception e) {
                    Entrada.nextLine();
                    System.out.println("\tIngrese valor numerico");
                }
            }

            Barcos = UbicarBarcos(JugadorUno, posX, posY);

        } while (Barcos < 4);

        Barcos = 0;
        System.out.println("\t        ~~~~Siguiente Jugador~~~~");
        System.out.println("\tColoque sus barcos de manera inteligente");

        do {

            comprobacion = true;
            while (comprobacion) {
                try {

                    System.out.println("\n**************************************************");
                    System.out.print("  \tJugador 2 - Barco " + (Barcos + 1) + ": Posicion X:");
                    posX = Entrada.nextInt();
                    System.out.println("\n**************************************************");
                    if (posX <= 8 && posX >= 0) {
                        comprobacion = false;
                    } else {
                        System.out.println("\tFuera de rango");
                        System.out.println("\tDel 1 al 8");
                    }
                } catch (Exception e) {
                    Entrada.nextLine();
                    System.out.println("\tIngrese valor numerico");
                }
            }
            comprobacion = true;
            while (comprobacion) {
                try {

                    System.out.println("\n**************************************************");
                    System.out.print("\tJugador 2 - Barco " + (Barcos + 1) + ": Posicion Y:");
                    posY = Entrada.nextInt();
                    System.out.println("**************************************************");
                    if (posY <= 8 && posY >= 0) {
                        comprobacion = false;
                    } else {
                        System.out.println("\tFuera de rango");
                        System.out.println("\tDel 1 al 8");
                    }
                } catch (Exception e) {
                    Entrada.nextLine();
                    System.out.println("\tIngrese valor numerico");
                }
            }

            Barcos = UbicarBarcos(JugadorDos, posX, posY);

        } while (Barcos < 4);

        int NumeroAtaque = 0;
        int NavesSobrantes = 0;
        int jugador = 0;
        do {
            comprobacion = true;
            while (comprobacion) {
                try {

                    jugador = NumeroAtaque % 2;

                    System.out.println("**************************************************************");
                    System.out.println("Preparando el misil del jugador " + (jugador + 1) + " En las siguientes posiciones");
                    System.out.println("**************************************************************");

                    System.out.print("\tJugador " + (jugador + 1) + ": Posicion X:");
                    posX = Entrada.nextInt();
                    System.out.println("**************************************************************");
                    if (posX <= 8 && posX >= 0) {
                        comprobacion = false;
                    } else {
                        System.out.println("\tFuera de rango");
                        System.out.println("\tDel 1 al 8");
                    }
                } catch (Exception e) {
                    Entrada.nextLine();
                    System.out.println("\tIngrese valor numerico");
                }
            }
            comprobacion = true;
            while (comprobacion) {
                try {

                    System.out.print("\tJugador " + (jugador + 1) + ": Posicion Y:");
                    posY = Entrada.nextInt();
                    System.out.println("**************************************************************");
                    if (posY <= 8 && posY >= 0) {
                        comprobacion = false;
                    } else {
                        System.out.println("\tFuera de rango");
                        System.out.println("\tDel 1 al 8");
                    }
                } catch (Exception e) {
                    Entrada.nextLine();
                    System.out.println("\tIngrese valor numerico");
                }
            }

            int[][] BarcosActuales;

            if (jugador == 0)
                BarcosActuales = JugadorDos;
            else
                BarcosActuales = JugadorUno;

            NavesSobrantes = Bombardeo(BarcosActuales, posX, posY, jugador + 1);

            NumeroAtaque++;

        } while (NavesSobrantes > 0);
        System.out.println("///////////////////////////////////////////");
        System.out.println("/////Felicidades Soldado " + (jugador + 1) + " has ganado/////");
        System.out.println("///////////////////////////////////////////");
        System.out.println("");
        System.out.println("");
        System.out.println("\tGracias por jugar!!!");
        Entrada.close();
    }

    public static int UbicarBarcos(int[][] JugadorBarcos, int posX, int posY) {
        int Barcos = 0;

        JugadorBarcos[posX][posY] = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (JugadorBarcos[i][j] != 0) {

                    Barcos++;
                }
            }
        }
        return Barcos;
    }

    public static int Bombardeo(int[][] JugadorBarcos, int posX, int posY, int NumeroJugador) {

        int value = JugadorBarcos[posX][posY];

        if (value != 0) {

            System.out.println(
                    "Barco derrumbado en la posicion X:" + posX + " Y:" + posY + " por el jugador " + NumeroJugador);
            System.out.println("");
        } else {

            System.out.println("Has fallado,Es el turno del siguiente jugador");
            System.out.println("");
        }

        JugadorBarcos[posX][posY] = 0;

        int BarcosRestantes = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (JugadorBarcos[i][j] != 0) {
                    BarcosRestantes++;
                }
            }
        }
        return BarcosRestantes;
    }
}