package Modelo;

public class Servicio {
    private String[] servicios;

    public Servicio(String... servicios) {
        this.servicios = servicios;
    }

    public void mostrarServicios() {
        System.out.println("Servicios incluidos: " + String.join(", ", servicios));
    }
}