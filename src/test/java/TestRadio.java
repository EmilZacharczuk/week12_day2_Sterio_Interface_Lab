import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRadio {

   Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "1995");
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", radio.make());
    }

    @Test
    public void hasmodel(){
        assertEquals("1995", radio.model());
    }

    @Test
    public void canTune(){
        assertEquals("tune the 1", radio.tune(1));
    }
}
