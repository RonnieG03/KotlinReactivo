package com.example.demo.repository

import com.example.demo.model.Book
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository


interface BookRepository: ReactiveCrudRepository<Book, Number> {
}