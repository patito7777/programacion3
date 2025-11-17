/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

public class MiTeleferico {
    private String nombre;
    private ArrayList<Linea> lineas;

    public MiTeleferico(String nombre) {
        this.nombre = nombre;
        lineas = new ArrayList<>();
    }

    public void agregarLinea(Linea l) {
        lineas.add(l);
    }

    public int totalLineas() {
        return lineas.size();
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }
}
