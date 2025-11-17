/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.ArrayList;

public class Linea {
    private String nombre;
    private ArrayList<Cabina> cabinas;

    public Linea(String nombre) {
        this.nombre = nombre;
        cabinas = new ArrayList<>();
    }

    public void agregarCabina(Cabina c) {
        cabinas.add(c);
    }

    public int totalCabinas() {
        return cabinas.size();
    }

    public ArrayList<Cabina> getCabinas() {
        return cabinas;
    }
}
