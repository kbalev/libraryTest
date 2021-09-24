package alexandria;

public class Main {
    public static void main(String[] args){

        Book newBook = new Book("Don Quixote", "Miguel de Cervantes", "Even More words, seriously dude, trust me", 1023);
        System.out.println(newBook.getTitle());

    }
}
