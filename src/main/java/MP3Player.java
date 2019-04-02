public class MP3Player implements IConnect{

    public String connect(Stereo stereo){
        return "connected to " + stereo.name();
    }
}
