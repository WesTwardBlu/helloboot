package com.east.helloboot.controller;

import com.east.helloboot.dao.ReadingListRepository;
import com.east.helloboot.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yaowg on 2017/11/14
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    private ReadingListRepository readingListRepository;

    public ReadingListController(ReadingListRepository readingListRepository){
        this.readingListRepository = readingListRepository;
    }

    @GetMapping(value = "/{reader}")
    public String readersBooks(@PathVariable(value = "reader") String reader, Model model){
        List<Book> readingList = readingListRepository.findByReader(reader);
        if (readingList != null){
            model.addAttribute("books", readingList);
        }
        return "readingList";

    }

    @PostMapping(value = "/{reader}")
    public String addToReadingList(@PathVariable(value = "reader") String reader, Book book){
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/{reader}";

    }

}
