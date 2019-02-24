import instruments.Guitar;
import interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("wood",1500, 6,"Gibson", "Les Paul", "wood");
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddItemToStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.addStock(guitar);
        assertEquals(1, shop.stockCount());
        shop.removeStock(guitar);
        assertEquals(0, shop.stockCount());

    }
}
