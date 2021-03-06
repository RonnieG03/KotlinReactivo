package com.example.demo.service


import com.example.demo.repository.BookRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.Duration


@Service
class BookService(private val bookRepository: BookRepository) {

    fun getAllBook() =
        bookRepository.findAll().log().delayElements(Duration.ofSeconds(1))


}