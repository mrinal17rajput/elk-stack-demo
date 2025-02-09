package com.example.elk_stack_demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Log4j2
public class ELKTestController {
    @GetMapping(value = "books",
    produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<String>> getBooks() {
        log.info("Received the request to fetch books");
        List<String> books = Arrays.asList("Book1", "Book2", "Book3");
        log.info("Books list: " + books);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
