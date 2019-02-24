import instruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;

    @Before
    public void before(){
        violin = new Violin(4, "Stradivarius", 1845);
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(4, violin.getNumOfStrings());
    }

    @Test
    public void canBePlayed(){
        assertEquals("Sqweek sqweek, I'm playing the fidley diddle", violin.play());
    }

    @Test
    public void hasManufacturer(){
        assertEquals("Stradivarius", violin.getManufacturer());
    }

    @Test
    public void hasYear(){
        assertEquals(1845, violin.getYear());
    }
}
