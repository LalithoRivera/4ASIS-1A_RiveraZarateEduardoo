/**
 * Vamos a crear un programa mediante el cual
 * podamos dar de alta un grupo maximo de 
 * 10 estudiantes y despues de ello pueda visualizar 
 * la lista completa
 * 
 */

import javax.swing.JOptionPane;

public class datos {

    //vamos a crear el objeto del estudiante
    Estudiante obj[] = new Estudiante[10];

    int x = 0;

    //metodo del menu
    void menu(){
        String var = "si";
        String mensaje = "";

        while(var.equalsIgnoreCase("si")){
            int op = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opcion deseada: \n "
            + "1.- Dar de alta a un nuevo estudiante: \n"
            + "2.- Mostrar los datos de un estudiante:"));

            switch(op){
                case 1:
                    //necesito un metod para solicitar la informacion del estudiante
                    pedirEstudiante();
                    break;
                case 2:
                    mostrarEstudiante();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");

            
            }
            mensaje = JOptionPane.showInputDialog("¿Desea repetir?");
        }
    }

    public void pedirEstudiante(){
        //solicitar cada uno de los datos
        int numbol = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta del estudiante: "));

        String nom = JOptionPane.showInputDialog("Ingresa el nombre del estudiante: ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante: "));
        char gen = JOptionPane.showInputDialog("Ingresa el genero del estudiante: ").charAt(0);

        //agregarlos a mi arreglo
        obj[x] = new Estudiante(numbol, nom, edad, gen);
        x++;
    }

    public void mostrarEstudiante(){
        //necesitamos usar los get de cada uno de los datos
        //necesito recorrer el arreglo
        for(int i = 0; i < x; i++){
            //visualizar
            JOptionPane.showMessageDialog(null, 
            "La boleta del estudiante es: " + obj[i].getNumBoleta() + "\n"+
            "El nombre del estudiante es: " + obj[i].getNombre() + "\n"+
            "La edad del estudiante es: " + obj[i].getEdad() + "\n"+
            "El genero del estudiante es: " + obj[i].getGenero() + "\n");
        }
    }
    
}