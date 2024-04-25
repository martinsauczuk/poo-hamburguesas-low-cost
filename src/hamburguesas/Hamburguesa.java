package hamburguesas;

/**
 * Clase abstracta para la herencia
 */
public abstract class Hamburguesa {

    /*
    Protected para que puedan acceder las clases hijas
     */
    protected int precioBase;

    public Hamburguesa(int precioBase) {
        this.precioBase = precioBase;
    }

    public abstract int calcularPrecioTotal();

}
