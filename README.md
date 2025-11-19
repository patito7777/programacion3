# programacion3
examen
main
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

public class Examen {

    public static void main(String[] args) {
       


    MiTeleferico mt = new MiTeleferico("Mi Teleférico");

 
    Linea lineaRoja = new Linea("Rojo");

    // cabinas
    Cabina c1 = new Cabina("Cabina1", 100);
    Cabina c2 = new Cabina("Cabina2", 120);

    lineaRoja.agregarCabina(c1);
    lineaRoja.agregarCabina(c2);

    mt.agregarLinea(lineaRoja);



    Persona p1 = new Persona("Ana", 23, 60);
    Persona p2 = new Persona("Luis", 40, 90);

    int nroCabina = 1; 
    Cabina cabinaSeleccionada = lineaRoja.getCabinas().get(nroCabina - 1);

    System.out.println("Intentando agregar persona a " + cabinaSeleccionada);

    // regla 1: máximo 10 personas
    if (cabinaSeleccionada.totalPersonas() >= 10) {
        System.out.println("cabina llena.");
    }
    //no masde 850 kg
    else if (cabinaSeleccionada.pesoTotal() + p1.getPeso() > 850) 
    {
        System.out.println("excede 850 kg.");
    }
    else 
    {
        cabinaSeleccionada.agregarPersona(p1);
        System.out.println("Persona agregada correctamente.");
    }




    boolean todasCorrectas = true;

    for (Linea linea : mt.getLineas()) {
        for (Cabina cabina : linea.getCabinas()) {

            if (cabina.totalPersonas() > 10) {
                todasCorrectas = false;
            }

            if (cabina.pesoTotal() > 850) {
                todasCorrectas = false;
            }
        }
    }

    System.out.println("¿Todas las cabinas cumplen las reglas? " + todasCorrectas);
}

    }
    



