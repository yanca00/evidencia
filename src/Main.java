public class Main {
    public static void main(String[] args) {
        // Crear un concesionario
        Concesionario concesionario = new Concesionario();

        // Agregar vehículos al inventario
        concesionario.agregarVehiculo(new Vehiculo("001", "Toyota", "Auto", 2020, 0));
        concesionario.agregarVehiculo(new Vehiculo("002", "Chevrolet", "Camioneta", 2018, 50000));
        concesionario.agregarVehiculo(new Vehiculo("003", "Suzuki", "Motocicleta", 2019, 10000));

        // Mostrar el inventario
        concesionario.mostrarInventario();

        // Realizar una venta
        concesionario.realizarVenta("002", 25000, "Pérez", "Juan", "12345678");

        // Mostrar el inventario y las ventas
        concesionario.mostrarInventario();
        concesionario.mostrarVentas();
    }
}
