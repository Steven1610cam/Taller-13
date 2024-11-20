public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    
    public abstract void calcularSalario();

    
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        calcularSalario(); 
    }
}