package Modelo;

public abstract class Ticket {
    protected Ruta ruta;
    protected Pasajero pasajero;
    protected double costoBase;
    protected boolean maletaAdicional;

    public Ticket(Ruta ruta, Pasajero pasajero, boolean maletaAdicional) {
        this.ruta = ruta;
        this.pasajero = pasajero;
        this.costoBase = ruta.getPrecio();
        this.maletaAdicional = maletaAdicional;
    }

    public abstract double calcularCosto();

    public void mostrarTicket() {
        pasajero.mostrarDatos();
        ruta.mostrarRuta();
        System.out.println("Costo total: $" + calcularCosto());
    }
}

