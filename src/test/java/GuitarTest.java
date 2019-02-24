import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood",1500, 6,"Gibson", "Les Paul", "wood");
    }

    @Test
    public void hasMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Les Paul", guitar.getModel());
    }
    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void guiatarCanBePlayed(){
        assertEquals("Twang, I'm playing the guitar", guitar.play());
    }


    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

}
