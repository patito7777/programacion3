/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.ArrayList;

public class Cabina {
    private String nombre;
    private float pesoCabina;
    private ArrayList<Persona> personas;

    public Cabina(String nombre, float pesoCabina) {
        this.nombre = nombre;
        this.pesoCabina = pesoCabina;
        this.personas = new ArrayList<>();
    }

    public boolean agregarPersona(Persona p) {
        if (personas.size() < 10) {  // Máximo 10 personas
            personas.add(p);
            return true;
        } else {
            System.out.println("La cabina está llena (10 personas).");
            return false;
        }
    }

    public int totalPersonas() {
        return personas.size();
    }

    public float pesoTotal() {
        float total = pesoCabina;
        for (Persona p : personas) total += p.getPeso();
        return total;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
}
