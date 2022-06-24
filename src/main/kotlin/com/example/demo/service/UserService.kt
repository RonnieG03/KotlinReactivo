package com.example.demo.service

import com.example.demo.client.UserClient
import org.springframework.stereotype.Service

@Service
class UserService (private val userClient: UserClient){

    fun getUser() =
        userClient.getUser()
}