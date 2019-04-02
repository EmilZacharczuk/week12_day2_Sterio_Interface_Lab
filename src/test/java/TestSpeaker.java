import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestSpeaker {

    Speaker speaker;
    Stereo stereo;
    RecordDeck recordDeck;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void before(){
        speaker = new Speaker();
        stereo = new Stereo("Alpha", recordDeck, radio, cdPlayer);
    }


    @Test
    public void canConnect(){
        assertEquals("connected to Alpha", speaker.connect(stereo));
    }
}
