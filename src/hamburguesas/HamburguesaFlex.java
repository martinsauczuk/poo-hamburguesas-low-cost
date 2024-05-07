package hamburguesas;

import componentes.Ingrediente;
import componentes.Medallon;

import java.util.ArrayList;
import java.util.List;

public class HamburguesaFlex extends Hamburguesa {

    List<Ingrediente> ingredientes = new ArrayList<>();
    List<Medallon> medallones = new ArrayList<>();


    public HamburguesaFlex(int precioBase) {
        super(precioBase);
    }

    public void agregarMedallon(Medallon unMedallon) {
        medallones.add(unMedallon);
    }

    public void agregarIngrediente(Ingrediente unIngrediente) {
        ingredientes.add(unIngrediente);
    }

    // No pedido en el ejercicio
    public int cuantosIngredientesVan() {
        return ingredientes.size();
    }

    // No pedido en el ejercicio
    public int cuantosMedallonesVan() {
        return medallones.size();
    }

    @Override
    public int calcularPrecioTotal() {

        int precioTotal = this.precioBase;

        // Forma 1 de iterar: no sugerida excepto que sean necesarios los indices
    //    for (int i = 0; i < ingredientes.size(); i++) {
    //        precioTotal = precioTotal + ingredientes.get(i).getPrecio();
    //    }

        // Forma 2: Interacion sobre los medallones.
        for (Medallon medallon : medallones) {
            precioTotal = precioTotal + medallon.getPrecio();
        }

        // Forma 2: Interacion sobre los ingredientes
        for (Ingrediente ingrediente : ingredientes) {
            precioTotal = precioTotal + ingrediente.getPrecio();
        }

        return precioTotal;

    }
}
