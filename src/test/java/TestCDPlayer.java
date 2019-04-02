import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCDPlayer {

    CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Sony", "1995",5);
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", cdPlayer.make());
    }

    @Test
    public void hasmodel(){
        assertEquals("1995", cdPlayer.model());
    }

    @Test
    public void canPlaySpeeds(){
        assertEquals(5, cdPlayer.numOfCDs());
    }

    @Test
    public void canPlay(){
        assertEquals("play CDPlayer", cdPlayer.play());
    }
}
