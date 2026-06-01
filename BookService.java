package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * BookService - 书籍服务类
 * 提供书籍的增删改查功能
<<<<<<< HEAD
=======
 * 
 * (仅测试git功能:123456789)
 * 
>>>>>>> dev
 */
public class BookService {
    
    private List<Book> bookList;
    
    public BookService() {
        bookList = new ArrayList<>();
        bookList.add(new Book(1, "Java编程思想", "Bruce Eckel", 99.0));
        bookList.add(new Book(2, "深入理解计算机系统", "Randal E. Bryant", 128.0));
        bookList.add(new Book(3, "设计模式：可复用面向对象软件的基础", "Erich Gamma", 68.0));
    }
    
    public void addBook(Book book) {
        bookList.add(book);
    }
    
    public boolean deleteBook(int id) {
        return bookList.removeIf(book -> book.getId() == id);
    }
    
    public boolean updateBook(int id, Book updatedBook) {
        for (int i = 0; i < bookList.size(); i++) {
            Book book = bookList.get(i);
            if (book.getId() == id) {
                bookList.set(i, updatedBook);
                return true;
            }
        }
        return false;
    }
    
    public Book getBookById(int id) {
        return bookList.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookList);
    }
    
    public List<Book> searchBooksByTitle(String keyword) {
        return bookList.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    public int getBookCount() {
        return bookList.size();
    }
    
    public void clearAllBooks() {
        bookList.clear();
    }
    
    /**
     * Book - 书籍实体类（内部类）
     * 表示一本书的基本信息
     */
    public static class Book {
        
        private int id;
        private String title;
        private String author;
        private double price;
        
        public Book() {
        }
        
        public Book(int id, String title, String author, double price) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.price = price;
        }
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        public String getTitle() {
            return title;
        }
        
        public void setTitle(String title) {
            this.title = title;
        }
        
        public String getAuthor() {
            return author;
        }
        
        public void setAuthor(String author) {
            this.author = author;
        }
        
        public double getPrice() {
            return price;
        }
        
        public void setPrice(double price) {
            this.price = price;
        }
        
        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
