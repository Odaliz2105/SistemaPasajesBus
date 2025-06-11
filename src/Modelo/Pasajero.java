package Modelo;

public class Pasajero {
    private String nombre;
    private String cedula;

    public Pasajero(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public void mostrarDatos() {
        System.out.println("Pasajero: " + nombre + ", Cédula: " + cedula);
    }
}
