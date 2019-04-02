import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestMP3Player {

    MP3Player mp3Player;
    Stereo stereo;
    Radio radio;
    RecordDeck recordDeck;
    CDPlayer cdPlayer;

    @Before
    public void before(){
        mp3Player = new MP3Player();
        stereo = new Stereo("Alpha", recordDeck, radio, cdPlayer);
    }

    @Test
    public void canConnect(){
        assertEquals("connected to Alpha", mp3Player.connect(stereo));
    }
}
