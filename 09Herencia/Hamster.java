import javax.swing.JOptionPane;

/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */


public class Hamster extends Animal{
    //aqui deberia de venir String
    String CHILLIDO;

    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String CHILLIDO){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.CHILLIDO = CHILLIDO;
    }

    //recibir
    public String getCHILLIDO(){
        return CHILLIDO;
    }

    //enviar
    public void setCHILLIDO(String CHILLIDO){
        this.CHILLIDO = CHILLIDO;
    }

    //el metodo propio del perro
    public void mostrarhamster(){
        
        JOptionPane.showMessageDialog(null,"El nombre del Hamster es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su CHILLIDO es: " + CHILLIDO);
    }
    }