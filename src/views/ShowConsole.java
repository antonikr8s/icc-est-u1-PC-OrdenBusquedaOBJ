package views;

import models.Persona;

public class ShowConsole {
    public void mostrarPersonas(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
