package controllers;

import models.Persona;

public class PersonaController {
    public void ordenarDireccionCodigo(Persona[] persona) {
        // Seleccion hacemos un barrido y busca el indice +a

        for (int i = 0; i < persona.length; i++) {
            int indx = i;
            for (int j = i + 1; j < persona.length; j++) {

                // if (persona[j].getCodigoDireccion() > persona[indx].getCodigoDireccion()) {

                if (persona[j].getCodigoDireccion() < persona[indx].getCodigoDireccion()) {
                    indx = j;
                }
            }

            if (indx != i) {
                Persona aux = persona[indx];
                persona[indx] = persona[i];
                persona[i] = aux;
            }
        }

    }

    public Persona findPersonaByCodigoDireccion(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {

            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getCodigoDireccion();
            if (valorCentro == codigo) {
                return personas[centro];
            } else if (valorCentro < codigo) {
                bajo = centro + 1;
            } else {
                alto = centro - 1;
            }
        }
        return null;
    }
}
