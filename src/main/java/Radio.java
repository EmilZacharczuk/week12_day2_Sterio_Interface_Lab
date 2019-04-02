public class Radio extends Component {

    public Radio(String make, String model){
        super(make, model);
    }

    public String make(){
        return this.make;
    }

    public String model(){
        return this.model;
    }

    public String tune(int radioStation){
      return "tune the " + radioStation;
    }


}
