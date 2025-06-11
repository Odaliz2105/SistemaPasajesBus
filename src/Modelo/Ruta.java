package Modelo;

public class Ruta {
        private String origen;
        private String destino;
        private double precio;

        public Ruta(String origen, String destino, double precio) {
            this.origen = origen;
            this.destino = destino;
            this.precio = precio;
        }

        public double getPrecio() {
            return precio;
        }

        public String getOrigen() {
            return origen;
        }

        public String getDestino() {
            return destino;
        }

        public void mostrarRuta() {
            System.out.println(origen + " - " + destino + " ($" + precio + ")");
        }

}
