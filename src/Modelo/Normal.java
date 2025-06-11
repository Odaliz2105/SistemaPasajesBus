package Modelo;

public class Normal extends Ticket {
    private String tipoAsiento;

    public Normal(Ruta ruta, Pasajero pasajero, boolean maletaAdicional, String tipoAsiento) {
        super(ruta, pasajero, maletaAdicional);
        this.tipoAsiento = tipoAsiento;
    }

    @Override
    public double calcularCosto() {
        double total = costoBase;
        if (maletaAdicional) {
            total += 5; // costo extra por maleta adicional
        }
        return total;
    }

    @Override
    public void mostrarTicket() {
        super.mostrarTicket();
        System.out.println("Asiento: " + tipoAsiento);
    }
}
