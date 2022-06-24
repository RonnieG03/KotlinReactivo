package com.example.demo.model

<<<<<<< HEAD

=======
>>>>>>> 17642667c5809fa6b1916c0a875542c15c4d2619
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.Entity
import javax.persistence.Id
@Entity
<<<<<<< HEAD
@Table(name = "book")
data class Book(
    @Id
    var id: Number,
    var title: String,
    var author: String
){
=======
@Table(name="book")
data class Book(@Id
                var id: Number,
                var tittle: String,
                var author: String) {
    constructor() : this(0,"a","") {

    }
>>>>>>> 17642667c5809fa6b1916c0a875542c15c4d2619


}

