package hamburguesas;

import componentes.Ingrediente;
import componentes.Medallon;

public class HamburguesaDoble extends Hamburguesa {

    private Medallon medallon1;

    private Medallon medallon2;

    private Ingrediente ingrediente1;

    private Ingrediente ingrediente2;


    public HamburguesaDoble(int precioBase) {
        super(precioBase);
    }

    @Override
    public int calcularPrecioTotal() {
        return precioBase
                + medallon1.getPrecio()
                + medallon2.getPrecio()
                + ingrediente1.getPrecio()
                + ingrediente2.getPrecio();
    }

    public Medallon getMedallon1() {
        return medallon1;
    }

    public void setMedallon1(Medallon medallon1) {
        this.medallon1 = medallon1;
    }

    public Medallon getMedallon2() {
        return medallon2;
    }

    public void setMedallon2(Medallon medallon2) {
        this.medallon2 = medallon2;
    }

    public Ingrediente getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(Ingrediente ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public Ingrediente getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(Ingrediente ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }
}
