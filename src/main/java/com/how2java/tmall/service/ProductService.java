package com.how2java.tmall.service;
 
import java.util.List;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.pojo.Product;

public interface ProductService {
    void add(Product p);
    void delete(int id);
    void update(Product p);
    Product get(int id);
    List list(int cid);
    void setFirstProductImage(Product p);

    //2. 为多个分类填充产品集合
    void fill(List<Category> cs);
    //1. 为分类填充产品集合
    void fill(Category c);
    //3.为多个分类填充推荐产品集合，即把分类下的产品集合，按照8个为一行，拆成多行，以利于后续页面上进行显示
    void fillByRow(List<Category> cs);
    //销量
    void setSaleAndReviewNumber(Product p);
    //评价数量
    void setSaleAndReviewNumber(List<Product> ps);
}