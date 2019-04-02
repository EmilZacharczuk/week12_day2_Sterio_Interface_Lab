public class Speaker implements IConnect {

    public String connect(Stereo stereo){
        return "connected to " + stereo.name();
    }
}
