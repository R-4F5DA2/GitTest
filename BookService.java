package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * BookService - 书籍服务类
 * 提供书籍的增删改查功能
 */
public class BookService {
    
    // 模拟数据库存储书籍
    private List<Book> bookList;
    
    public BookService() {
        bookList = new ArrayList<>();
        // 初始化一些示例数据
        bookList.add(new Book(1, "Java编程思想", "Bruce Eckel", 99.0));
        bookList.add(new Book(2, "深入理解计算机系统", "Randal E. Bryant", 128.0));
        bookList.add(new Book(3, "设计模式：可复用面向对象软件的基础", "Erich Gamma", 68.0));
    }
    
    /**
     * 添加书籍
     * @param book 要添加的书籍对象
     */
    public void addBook(Book book) {
        bookList.add(book);
    }
    
    /**
     * 根据ID删除书籍
     * @param id 书籍ID
     * @return 是否删除成功
     */
    public boolean deleteBook(int id) {
        return bookList.removeIf(book -> book.getId() == id);
    }
    
    /**
     * 根据ID更新书籍信息
     * @param id 书籍ID
     * @param updatedBook 更新后的书籍对象
     * @return 是否更新成功
     */
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
    
    /**
     * 根据ID查询书籍
     * @param id 书籍ID
     * @return 书籍对象，如果不存在返回null
     */
    public Book getBookById(int id) {
        return bookList.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    /**
     * 查询所有书籍
     * @return 书籍列表
     */
    public List<Book> getAllBooks() {
        return new ArrayList<>(bookList);
    }
    
    /**
     * 根据书名模糊查询
     * @param keyword 书名关键词
     * @return 匹配的书籍列表
     */
    public List<Book> searchBooksByTitle(String keyword) {
        return bookList.stream()
                .filter(book -> book.getTitle().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    /**
     * 获取书籍数量
     * @return 书籍总数
     */
    public int getBookCount() {
        return bookList.size();
    }
    
    /**
     * 清空所有书籍
     */
    public void clearAllBooks() {
        bookList.clear();
    }
}
