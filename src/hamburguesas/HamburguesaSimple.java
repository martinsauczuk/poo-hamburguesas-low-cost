package hamburguesas;

import componentes.Ingrediente;
import componentes.Medallon;

public class HamburguesaSimple extends Hamburguesa {

    private Medallon medallon1;

    private Ingrediente ingrediente1;

    public HamburguesaSimple(int precioBase) {
        super(precioBase);
    }

    @Override
    public int calcularPrecioTotal() {
        return precioBase
                + medallon1.getPrecio()
                + ingrediente1.getPrecio();
    }

    public Medallon getMedallon1() {
        return medallon1;
    }

    public void setMedallon1(Medallon medallon1) {
        this.medallon1 = medallon1;
    }


    public Ingrediente getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(Ingrediente ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

}
