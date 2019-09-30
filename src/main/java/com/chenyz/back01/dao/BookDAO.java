package com.chenyz.back01.dao;

import com.chenyz.back01.pojo.Book;
import com.chenyz.back01.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Create by cqca43004 on 2019/9/17,
 */
public interface BookDAO extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}
