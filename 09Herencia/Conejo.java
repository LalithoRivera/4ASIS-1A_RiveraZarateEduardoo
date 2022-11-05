import javax.swing.JOptionPane;

/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */


public class Conejo extends Animal{
    //aqui deberia de venir String
    String Ronroneo;

    public Conejo(){

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String Ronroneo){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.Ronroneo = Ronroneo;
    }

    //recibir
    public String getRonroneo(){
        return Ronroneo;
    }

    //enviar
    public void setRonroneo(String Ronroneo){
        this.Ronroneo = Ronroneo;
    }

    //el metodo propio del perro
    public void mostrarConejo(){
        
        JOptionPane.showMessageDialog(null,"El nombre del Conejo es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su Ronroneo es: " + Ronroneo);
    }
    }