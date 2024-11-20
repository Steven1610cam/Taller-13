public class Main {
    public static void main(String[] args) {
        
        Empleado gerente = new Gerente("Juan Pérez", 1500);
        Empleado vendedor = new Vendedor("Ana Gómez", 300);

        
        System.out.println("Detalles del Gerente:");
        gerente.mostrarDetalles();

        System.out.println("\nDetalles del Vendedor:");
        vendedor.mostrarDetalles();
    }
}