public class CDPlayer extends Component implements IPlay {
    private int numOfCDs;

    public CDPlayer(String make, String model, int numOfCDs){
        super(make, model);
        this.numOfCDs = numOfCDs;
    }

    public String make(){
        return this.make;
    }

    public String model(){
        return this.model;
    }

    public int numOfCDs(){
        return this.numOfCDs;
    }

    public String play(){
        return "play CDPlayer";
    }
}
