package com.example.demo.controller

import com.example.demo.service.BookService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Duration


@RestController
@RequestMapping("books")
class BookController(private val bookService: BookService) {

    @GetMapping(value = ["/"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun getAllBook() =
        bookService.getAllBook().delayElements(Duration.ofSeconds(1))


}