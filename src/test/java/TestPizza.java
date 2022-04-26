import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import br.com.ita.pizzaria.model.Pizza;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestPizza {

    @Before
    public void limpar() {
        Pizza.zeraIngredientes();
    }

    @Test
    public void test() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Presunto");

        assertEquals(3, pizza.getIngrediente().size());
    }

    @Test
    public void testIngredientes() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Presunto");

        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.addAll(pizza.getIngrediente());

        assertEquals(ingredientes, pizza.getIngrediente());
    }
}