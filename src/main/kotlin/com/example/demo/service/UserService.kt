package com.example.demo.service

import com.example.demo.client.UserClient
<<<<<<< HEAD
import org.springframework.stereotype.Service

@Service
class UserService (private val userClient: UserClient){

    fun getUser() =
        userClient.getUser()
}
=======
import com.example.demo.repository.BookRepository
import org.springframework.stereotype.Service
import java.time.Duration
@Service
class UserService(private val userClient: UserClient) {

        fun getUser() =
            userClient.getUser()
    }
>>>>>>> 17642667c5809fa6b1916c0a875542c15c4d2619
