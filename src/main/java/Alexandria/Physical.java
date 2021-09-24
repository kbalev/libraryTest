package Alexandria;

public abstract class Physical extends Inventory {


    public Physical(){
        super(false);
    }
    public Physical(boolean borrowed){
        super(borrowed);
    }

}
