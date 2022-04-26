import static org.junit.Assert.*;

import br.com.ita.pizzaria.model.CarrinhoDeCompras;
import br.com.ita.pizzaria.model.Pizza;
import org.junit.jupiter.api.Test;


public class TestCarrinhoDeCompras {

    @Test
    public void testVerificarPreco() {
        Pizza pizza = new Pizza();

        pizza.adicionaIngrediente("Tomate");
        pizza.adicionaIngrediente("Queijo");
        pizza.adicionaIngrediente("Presunto");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addPizza(pizza);

        assertEquals(20.0, carrinho.getPrecoTotal(), 0);
    }

    @Test
    public void testIngredientesVazio() {
        Pizza pizza = new Pizza();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.addPizza(pizza);

        assertEquals(0, carrinho.getPrecoTotal(), 0);
    }

}
