package Modelo;

public class Vip extends Ticket {
    private Servicio serviciosExtras;

    public Vip(Ruta ruta, Pasajero pasajero, boolean maletaAdicional, Servicio serviciosExtras) {
        super(ruta, pasajero, maletaAdicional);
        this.serviciosExtras = serviciosExtras;
    }

    @Override
    public double calcularCosto() {
        double total = costoBase * 1.3; // recargo del 30%
        if (maletaAdicional) {
            total += 5;
        }
        return total;
    }

    @Override
    public void mostrarTicket() {
        super.mostrarTicket();
        serviciosExtras.mostrarServicios();
    }
}
