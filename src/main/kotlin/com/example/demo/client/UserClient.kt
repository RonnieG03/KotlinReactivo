package com.example.demo.client

import com.example.demo.model.User
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono
<<<<<<< HEAD

@Component
class UserClient  {

    fun getUser(): Mono<User>{
        var client = WebClient.create("http://localhost:3000")
        return client
            .get()
            .uri("/user")
            .retrieve()
            .bodyToMono(User::class.java)
    }
=======
@Component
class UserClient {
    fun getUser (): Mono<User>{
        var client= WebClient.create("http://localhost:3000")
        return client
            .get()
            .uri("/users")
            .retrieve()
            .bodyToMono(User::class.java)
    }

>>>>>>> 17642667c5809fa6b1916c0a875542c15c4d2619
}