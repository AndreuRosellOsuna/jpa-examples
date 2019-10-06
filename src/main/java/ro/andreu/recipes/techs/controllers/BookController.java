package ro.andreu.recipes.techs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.andreu.recipes.techs.daos.BookDao;
import ro.andreu.recipes.techs.models.Book;

@RestController
public class BookController {

    @Autowired
    private BookDao dao;

    @RequestMapping("/book")
    public Book getBook(@RequestParam String name) {
        return dao.getByName(name);
    }
}
