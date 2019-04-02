import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRecodeDeck {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Sony", "1995", 4);
    }

    @Test
    public void hasMake(){
        assertEquals("Sony", recordDeck.make());
    }

    @Test
    public void hasmodel(){
        assertEquals("1995", recordDeck.model());
    }

    @Test
    public void canPlaySpeeds(){
        assertEquals(4, recordDeck.playSpeeds());
    }

    @Test
    public void canPlay(){
        assertEquals("play recordDeck", recordDeck.play());
    }
}
