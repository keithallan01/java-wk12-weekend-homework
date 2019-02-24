import instruments.Accordion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccordionTest {

    Accordion accordion;

    @Before
    public void before(){
        accordion = new Accordion("button", 120);
    }

    @Test
    public void hasType(){
        assertEquals("button", accordion.getType());
    }

    @Test
    public void hasNumOfButtons(){
       assertEquals(120, accordion.getNumButtons());
    }

    @Test
    public void canPlay(){
        assertEquals("wheeze", accordion.play());
    }

}
