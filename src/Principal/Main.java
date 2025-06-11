package Principal;

import Modelo.*;

public class Main {
    public static void main(String[] args) {
        // Objetos con valores nulos (luego seteados con setters)
        Ruta ruta1 = new Ruta("Quito", "Guayaquil", 20);
        Pasajero pasajero1 = new Pasajero("Odaliz Balseca", "1102233445");
        Normal ticket1 = new Normal(ruta1, pasajero1, false, "ventana");

        Ruta ruta2 = new Ruta("Quito", "Tulcán", 17.50);
        Pasajero pasajero2 = new Pasajero("Carlos Pérez", "1103344556");
        Vip ticket2 = new Vip(ruta2, pasajero2, true, new Servicio("TV", "Internet", "Comida", "Asistente"));

        // Objetos con valores quemados directamente
        Ticket ticket3 = new Normal(
                new Ruta("Quito", "Puyo", 15),
                new Pasajero("Elian Burbano", "1109988776"),
                true,
                "adelante"
        );

        Ticket ticket4 = new Vip(
                new Ruta("Quito", "Riobamba", 17.50),
                new Pasajero("Ariel Balseca", "1107766554"),
                false,
                new Servicio("TV", "Internet", "USB", "Asistente")
        );

        Ticket ticket5 = new Normal(
                new Ruta("Quito", "Guayaquil", 20),
                new Pasajero("Mateo Perez", "1106677889"),
                true,
                "final"
        );

        // Mostrar tickets
        System.out.println("==== TICKET 1 ====");
        ticket1.mostrarTicket();
        System.out.println("\n==== TICKET 2 ====");
        ticket2.mostrarTicket();
        System.out.println("\n==== TICKET 3 ====");
        ticket3.mostrarTicket();
        System.out.println("\n==== TICKET 4 ====");
        ticket4.mostrarTicket();
        System.out.println("\n==== TICKET 5 ====");
        ticket5.mostrarTicket();
    }
}
