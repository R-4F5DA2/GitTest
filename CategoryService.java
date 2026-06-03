package com.example.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }
/**
 * CategoryService - 分类服务类
 * 提供分类的增删改查功能
 * 
 * 测试版本号：2222
 * 
 */
public class CategoryService {
    
    private List<Category> categoryList;
    
    public CategoryService() {
        categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "编程语言", "Programming Languages"));
        categoryList.add(new Category(2, "操作系统", "Operating Systems"));
        categoryList.add(new Category(3, "数据结构", "Data Structures"));
    }
    
    public void addCategory(Category category) {
        categoryList.add(category);
    }
    
    public boolean deleteCategory(int id) {
        return categoryList.removeIf(cat -> cat.getId() == id);
    }
    
    public boolean updateCategory(int id, Category updatedCategory) {
        for (int i = 0; i < categoryList.size(); i++) {
            Category cat = categoryList.get(i);
            if (cat.getId() == id) {
                categoryList.set(i, updatedCategory);
                return true;
            }
        }
        return false;
    }
    
    public Category getCategoryById(int id) {
        return categoryList.stream()
                .filter(cat -> cat.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    public List<Category> getAllCategories() {
        return new ArrayList<>(categoryList);
    }
    
    public List<Category> searchCategoriesByName(String keyword) {
        return categoryList.stream()
                .filter(cat -> cat.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    public int getCategoryCount() {
        return categoryList.size();
    }
    
    public void clearAllCategories() {
        categoryList.clear();
    }
    
    /**
     * Category - 分类实体类（内部类）
     * 表示一个分类的基本信息
     */
    public static class Category {
        
        private int id;
        private String name;
        private String englishName;
        
        public Category() {
        }
        
        public Category(int id, String name, String englishName) {
            this.id = id;
            this.name = name;
            this.englishName = englishName;
        }
        
        public int getId() {
            return id;
        }
        
        public void setId(int id) {
            this.id = id;
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public String getEnglishName() {
            return englishName;
        }
        
        public void setEnglishName(String englishName) {
            this.englishName = englishName;
        }
        
        @Override
        public String toString() {
            return "Category{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", englishName='" + englishName + '\'' +
                    '}';
        }
    }
}