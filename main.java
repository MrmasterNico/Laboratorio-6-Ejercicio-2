public class Main {
    public static void main(String[] args) {

        // Crear objetos
        
        Carro carro = new Carro("MXP452", "Mazda", 210, 5);
        Moto moto = new Moto("KLR098", "Kawasaki", 160, "Enduro");
        Camion camion = new Camion("HGT331", "Scania", 110, 12500.5);

        // Uso de métodos
        System.out.println("=== CARRO ===");
        carro.mostrarInfo();
        carro.mover();
        System.out.println("Peaje: $" + carro.calcularPeaje());

        System.out.println("\n=== MOTO ===");
        moto.mostrarInfo();
        moto.mover();
        System.out.println("Peaje: $" + moto.calcularPeaje());

        System.out.println("\n=== CAMIÓN ===");
        camion.mostrarInfo();
        camion.mover();
        System.out.println("Peaje: $" + camion.calcularPeaje());
    }
}
