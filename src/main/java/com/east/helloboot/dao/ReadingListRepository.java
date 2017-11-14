package com.east.helloboot.dao;

import com.east.helloboot.dto.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yaowg on 2017/11/14
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{


    List<Book> findByReader(String reader);


}
