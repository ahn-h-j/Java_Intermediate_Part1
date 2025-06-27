package nested.question;

import java.util.ArrayList;
import java.util.List;

public class Library {
    int max;
    List<Book> bookList = new ArrayList<>(max);
    public Library(int max) {
        this.max = max;
    }

    class Book{
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author){
        if(bookList.size() == max){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        Book book = new Book(title, author);
        bookList.add(book);
    }

    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");

        for (Book book : bookList) {
            System.out.println("도서 제목 : " + book.title  + ", 저자 : " + book.author);
        }
    }
}
