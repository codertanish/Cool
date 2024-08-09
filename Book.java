public class Book {
public static class BookDefinition {
    String name = "Book";
    String author = "Person";
    double price = 10;
    boolean soldStatus = false;
    
    public BookDefinition(){
System.out.println("Object Created");
    }

    public void sell() {
        soldStatus = true;
    }

    public void rename(String name) {
        this.name = name;
    }
    public String getStatus() {
        if (soldStatus == true) {
            return "Book has been sold";
        }
        return "Book has not been sold";
    }
}

public static void main(String[] args) {
    BookDefinition myBook = new BookDefinition();
    System.out.println("Book Name: " + myBook.name);
    System.out.println(myBook.getStatus());
    myBook.sell();
    myBook.rename("myBook");
    System.out.println("Book Name: " + myBook.name);
    System.out.println(myBook.getStatus());

    }
}

