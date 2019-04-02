public class RecordDeck extends Component implements IPlay {
    private int playSpeeds;

    public RecordDeck(String make, String model, int playSpeeds){
        super(make, model);
        this.playSpeeds = playSpeeds;
    }

    public String make(){
        return this.make;
    }

    public String model(){
        return this.model;
    }

    public int playSpeeds(){
        return this.playSpeeds;
    }

    public String play(){
        return "play recordDeck";
    }


}
