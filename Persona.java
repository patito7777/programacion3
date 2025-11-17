
package examen;

public class Persona {
    private String nombre;
    private int edad;
    private float peso;

    public Persona(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre + " (edad: " + edad + ", peso: " + peso + ")";
    }

    public int getEdad()
    { 
        return edad; 
    }
    public float getPeso() 
    { 
        return peso; 
    }
}
