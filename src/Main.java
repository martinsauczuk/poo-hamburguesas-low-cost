import componentes.Ingrediente;
import componentes.Medallon;
import hamburguesas.HamburguesaDoble;
import hamburguesas.HamburguesaFlex;
import hamburguesas.HamburguesaSimple;

public class Main {
    public static void main(String[] args) {

        // Medallones
        Medallon carneVacuna = new Medallon(1500);
        Medallon pollo = new Medallon(1200);
        Medallon veggie = new Medallon(1300);


        // Ingredientes
        Ingrediente lechugaTomate = new Ingrediente(300);
        Ingrediente cebolla = new Ingrediente(250);
        Ingrediente cheddar = new Ingrediente(400);
        Ingrediente bacon = new Ingrediente(450);


        // Test hamburguesa simple
        HamburguesaSimple simple01 = new HamburguesaSimple(3000);
        simple01.setMedallon1(pollo);
        simple01.setIngrediente1(cebolla);
        System.out.println("El precio final de simple01 es:" + simple01.calcularPrecioTotal());

        // Test hamburguesa doble
        HamburguesaDoble contradiccionIdeologica = new HamburguesaDoble(3000);
        contradiccionIdeologica.setMedallon1(carneVacuna);
        contradiccionIdeologica.setMedallon2(veggie);
        contradiccionIdeologica.setIngrediente1(lechugaTomate);
        contradiccionIdeologica.setIngrediente2(bacon);
        System.out.println("El precio final de contradiccionIdeologica es:" + contradiccionIdeologica.calcularPrecioTotal());


        System.out.println("Probando las hamburguesas Flex con ejemplos");

        // Creando hamburguesas Flex
        HamburguesaFlex triplePolloCuadrupleCheedarCebolla = new HamburguesaFlex(3000);
        triplePolloCuadrupleCheedarCebolla.agregarMedallon(pollo);
        triplePolloCuadrupleCheedarCebolla.agregarMedallon(pollo);
        triplePolloCuadrupleCheedarCebolla.agregarMedallon(pollo);
        triplePolloCuadrupleCheedarCebolla.agregarIngrediente(cheddar);
        triplePolloCuadrupleCheedarCebolla.agregarIngrediente(cheddar);
        triplePolloCuadrupleCheedarCebolla.agregarIngrediente(cheddar);
        triplePolloCuadrupleCheedarCebolla.agregarIngrediente(cheddar);
        triplePolloCuadrupleCheedarCebolla.agregarIngrediente(cebolla);
        System.out.println("La triplePolloCuadrupleCheedarCebolla sale " + triplePolloCuadrupleCheedarCebolla.calcularPrecioTotal() );

        System.out.println("Si la terminás te llevás un Hepatalgina gratis :)");





    }
}