public class Book {
public static class BookDefinition {
    String name;
    String author;
    double price;
    boolean soldStatus;
    
    public BookDefinition(String name, String author, double price, boolean soldStatus){
        this.name = name;
        this.author = author;
        this.price = price;
        this.soldStatus = soldStatus;
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
    BookDefinition myBook = new BookDefinition("Book", "Person", 15, false);
    System.out.println("Book Name: " + myBook.name);
    System.out.println(myBook.getStatus());
    myBook.sell();
    myBook.rename("myBook");
    System.out.println("Book Name: " + myBook.name);
    System.out.println(myBook.getStatus());

    }
}

