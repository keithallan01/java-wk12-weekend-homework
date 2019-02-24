import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(6,"Gibson", "Les Paul");
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


}
