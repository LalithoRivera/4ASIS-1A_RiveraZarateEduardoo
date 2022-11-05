
import javax.swing.JOptionPane;

public class inicio {

    public static void main(String[] args){
        /*/perro/*/String nombre,raza,tipo_alimento;
        /*/perro/*/int edad;
        /*Gato*/String nombreG,razaG,tipo_alimentoG;
        /*Gato */int edadG;
        /*Hamster */String nombreH,razaH,tipo_alimentoH;
        /*Hamster */int edadH;
        /*Conejo */String nombreC,razaC,tipo_alimentoC;
        /*Conejo */int edadC;
        JOptionPane.showMessageDialog(null,"**Formulario del Perro**");

        nombre=JOptionPane.showInputDialog (null,"Ingrese el nombre de tu mascota: ","solicitando datos: ");
        raza=JOptionPane.showInputDialog (null,"Ingresa la raza de tu mascota: ","solicitando datos: ");
        tipo_alimento=JOptionPane.showInputDialog (null,"Ingrese que alimento come su mascota: ","solicitando datos: ");
        edad=Integer.parseInt(JOptionPane.showInputDialog (null,"Ingrese la edad de su mascota","Solicitado datos: "));
        
        JOptionPane.showMessageDialog(null,"**Formulario del Gato**");

        nombreG=JOptionPane.showInputDialog (null,"Ingrese el nombre de tu mascota: ","solicitando datos: ");
        razaG=JOptionPane.showInputDialog (null,"Ingresa la raza de tu mascota: ","solicitando datos: ");
        tipo_alimentoG=JOptionPane.showInputDialog (null,"Ingrese que alimento come su mascota: ","solicitando datos: ");
        edadG=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad de su mascota","Solicitado datos: "));

        JOptionPane.showMessageDialog(null,"**Formulario del Hamster**");

        nombreH=JOptionPane.showInputDialog (null,"Ingrese el nombre de tu mascota: ","solicitando datos: ");
        razaH=JOptionPane.showInputDialog (null,"Ingresa la raza de tu mascota: ","solicitando datos: ");
        tipo_alimentoH=JOptionPane.showInputDialog (null,"Ingrese que alimento come su mascota: ","solicitando datos: ");
        edadH=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad de su mascota","Solicitado datos: "));

        JOptionPane.showMessageDialog(null,"**Formulario del Conejo**");


        nombreC=JOptionPane.showInputDialog (null,"Ingrese el nombre de tu mascota: ","solicitando datos: ");
        razaC=JOptionPane.showInputDialog (null,"Ingresa la raza de tu mascota: ","solicitando datos: ");
        tipo_alimentoC=JOptionPane.showInputDialog (null,"Ingrese que alimento come su mascota: ","solicitando datos: ");
        edadC=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad de su mascota","Solicitado datos: "));
        
        
        //hago la instancia del animal perro
        perro dog = new perro(nombre, raza, tipo_alimento, edad,"gua gua");
        Gato cat = new Gato(nombreG, razaG, tipo_alimentoG, edadG, 7);
        Hamster ham = new Hamster(nombreH,razaH,tipo_alimentoH,edadH,"i i i");
        Conejo rabit = new Conejo(nombreC,razaC,tipo_alimentoC,edadC,"purr");
        /*Quiero que se cree un menu mediante el cual el usuario pueda ingresar los datos de los animales:
         * 
         * 1.- Perro
         * 2.- Gato
         * 3.- Hamster
         * 4.- Conejo
         * 5.- Cuyo
         * 6.- Urons
         * 7.- Otro
         * 
         * Debera de poder ingresar cada uno de los datos y asi mismo deberan de entregar el diagrama de clases hecho en star uml aplicando la herencia correspondiente y el programa
        */

        //muestro
        dog.mostrarPerro();
        cat.mostrarGato();
        ham.mostrarhamster();
        rabit.mostrarConejo();
    

    }
    
}