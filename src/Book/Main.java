package Book;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("山本の論文", 2000),
                new Book("嫌われる勇気", 1200),
                new Book("Javaのクラス設計", 3000),
                new Book("お金の大学", 800)
        };

        for (Book book : books) {
            book.print();
        }

        Book expensiveBook = seachExpensiveBook(books);
        System.out.print("\n一番高い本: ");
        expensiveBook.print();
    }

    public static Book seachExpensiveBook(Book[] books) {
        Book mostExpensive = books[0];
        for (Book book : books) {
            if (book.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = book;
            }
        }
        return mostExpensive;
    }

}
