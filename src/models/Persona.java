package models;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;

    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getCodigoDireccion() {
        return direccion.getCodigo();
    }

    /*
     * Aqui nos dice si el codigoDireccion de Maria es MAYOR al codigoDireccion de
     * otra persona que vaya ingresar
     */
    public boolean equalsByCodigoDireccion(Persona otrasPersona) {
        /*
         * boolean resp = direccion.getCodigo() >
         * otrasPersona.getDireccion().getCodigo();
         */
        boolean resp = this.getCodigoDireccion() > otrasPersona.getCodigoDireccion();
        return resp;
    }

    // llega un numero de direccion
    public boolean equalsByCodigoDireccion(int codigoDireccion) {
        
        return getCodigoDireccion()==codigoDireccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Dirección: " + direccion;
    }

}
