package com.example.demo.model


import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Book(
    @Id
    val id: Number,
    val title: String,
    val author: String
    ){

}
