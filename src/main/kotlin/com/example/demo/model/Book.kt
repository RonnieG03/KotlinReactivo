package com.example.demo.model


import org.springframework.data.relational.core.mapping.Table
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Table(name = "book")
data class Book(
    @Id
    var id: Number,
    var title: String,
    var author: String
){


}
