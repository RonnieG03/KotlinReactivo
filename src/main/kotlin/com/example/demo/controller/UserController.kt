package com.example.demo.controller

import com.example.demo.service.BookService
import com.example.demo.service.UserService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Duration

@RestController
@RequestMapping("users")
class UserController (private val userService: UserService){

            @GetMapping(value = ["/getById"], produces = [MediaType.APPLICATION_JSON_VALUE])
        fun getUser() =
            userService.getUser()

}
