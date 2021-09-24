package Alexandria;

public abstract class Inventory {

    private boolean borrowed;

    public Inventory(boolean borrowed){
        this.borrowed = borrowed;
    }

    public void request(){
        System.out.println("Please wait while we check if the book you have requested is  available.");
        if (!borrowed){
            System.out.println("Your book is available for collection, please proceed to the next step.");

        } else {
            System.out.println("Unfortunately, your book is not available at this time. Please try again later.");
        }
    }

    public void borrow(){
        if (!borrowed){
            this.borrowed = !borrowed;

        }
    }

    public void bringBack(){
        if (borrowed){
            this.borrowed = !borrowed;
        }
    }
}
