package practice;

import java.util.Arrays;

// Coding By 김용선.

class Book {
    int price;

    Book(int price) {
        this.price = price;
    }

    Book(Book[] b) {

        int[] a = new int[b.length];

        for (int i = 0; i < b.length; i++) {
            a[i] = b[i].price;
        }

        Arrays.sort(a);

        for (int i = 0; i < b.length; i++) {
            b[i].price = a[i];
        }

    }

    void show() {
        System.out.println("Book [price =" + price + "]");
    }
}

public class problem03 {
    public static void main(String[] args) {
        Book[] books = { new Book(15000), new Book(50000), new Book(20000) };

        System.out.println("정렬 전");
        for (Book b : books)
            b.show();

        new Book(books);

        System.out.println("정렬 후");
        for (Book b : books)
            b.show();
    }
}
