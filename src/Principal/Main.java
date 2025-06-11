package Principal;

import Modelo.*;

public class Main {
    public static void main(String[] args) {
       
        // Objetos con valores quemados directamente
        Ticket ticket3 = new Normal(
                new Ruta("Quito", "Puyo", 15),
                new Pasajero("Daniela Ríos", "1109988776"),
                true,
                "adelante"
        );

        Ticket ticket4 = new Vip(
                new Ruta("Quito", "Riobamba", 17.50),
                new Pasajero("Luis Vaca", "1107766554"),
                false,
                new Servicio("TV", "Internet", "USB", "Asistente")
        );

        Ticket ticket5 = new Normal(
                new Ruta("Quito", "Guayaquil", 20),
                new Pasajero("Mateo Silva", "1106677889"),
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
