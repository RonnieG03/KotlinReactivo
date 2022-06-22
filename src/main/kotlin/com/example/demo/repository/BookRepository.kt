package com.example.demo.repository

import com.example.demo.model.Book
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface BookRepository: ReactiveCrudRepository<String, Number> {
}