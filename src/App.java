import controllers.PersonaController;
import models.Direccion;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[5];

        personas[0] = new Persona("Maria", 30, new Direccion("Calle 2", 23, 56));
        personas[1] = new Persona("Pedro", 35, new Direccion("Calle 3", 34, 67));
        personas[2] = new Persona("Ana", 28, new Direccion("Calle 4", 45, 78));
        personas[3] = new Persona("Juan", 25, new Direccion("Calle 1", 12, 45));
        personas[4] = new Persona("Luis", 40, new Direccion("Calle 5", 56, 89)); 

        ShowConsole sc = new ShowConsole();
        PersonaController pc = new PersonaController();

        System.out.println("====Personas antes de ordenar");
        sc.mostrarPersonas(personas);

        pc.ordenarDireccionCodigo(personas);

        System.out.println("\n====Personas ordenadas por codigo de direccion");
        sc.mostrarPersonas(personas);

        Persona personaBuscada=pc.findPersonaByCodigoDireccion(personas, 89);
        if(personaBuscada==null){
            System.out.println("\nNo existe esa persona con ese codigo");
        }else{
            System.out.println("\n==PERSONA ENCONTRADA");
            System.out.println(personaBuscada);
        }
    }

}
