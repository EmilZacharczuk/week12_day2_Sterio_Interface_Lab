public class Stereo {
    private String name;
    private RecordDeck recordDeck;
    private Radio radio;
    private CDPlayer cdPlayer;


    public Stereo(String name, RecordDeck recordDeck, Radio radio, CDPlayer cdPlayer){
        this.name = name;
        this.recordDeck = recordDeck;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
    }

    public String name(){
        return this.name;
    }


    public String playRecordDeck(RecordDeck recordDeck){
        return recordDeck.play();
    }

    public String playCdPlayer(CDPlayer cdPlayer){
        return cdPlayer.play();
    }

    public String playRadioTune(Radio radio, int station){
        return radio.tune(station);
    }



}
