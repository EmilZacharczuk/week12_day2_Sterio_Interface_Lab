import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestStereo {

    Stereo stereo;
    RecordDeck recordDeck;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void before(){
        stereo = new Stereo("Alpha", recordDeck, radio, cdPlayer);
        recordDeck = new RecordDeck("Sony", "1995", 4);
        radio = new Radio("Sony", "1995");
        cdPlayer = new CDPlayer("Sony", "1995",5);
        }
    @Test
    public void canplayRecordDeck(){
        assertEquals("play recordDeck", stereo.playRecordDeck(recordDeck));
    }

    @Test
    public void getName(){
        assertEquals("Alpha", stereo.name());
    }

    @Test
    public void canPlayCDPlayer(){
        assertEquals("play CDPlayer", stereo.playCdPlayer(cdPlayer));
    }

    @Test
    public void canPlayRadioTune(){
        assertEquals("tune the 1", stereo.playRadioTune(radio, 1));
    }

    @Test
    public void canPlayRadio(){
        assertEquals("tune the 1", stereo.playRadioTune(radio, 1));
    }





}
