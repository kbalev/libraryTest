package alexandria;

public abstract class Digital extends Inventory {


    public Digital(){
        super(false);
    }
    public Digital(boolean borrowed){
        super(borrowed);
    }

    public String requiredDevice(){
        return "I require a computer to be viewed";
    };
}
