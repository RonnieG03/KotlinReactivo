package com.example.demo.service

import com.example.demo.client.UserClient
import com.example.demo.repository.BookRepository
import org.springframework.stereotype.Service
import java.time.Duration
@Service
class UserService(private val userClient: UserClient) {

        fun getUser() =
            userClient.getUser()
    }
