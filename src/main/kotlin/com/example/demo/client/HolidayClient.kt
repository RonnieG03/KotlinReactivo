package com.example.demo.client

import com.example.demo.model.Holiday
import com.example.demo.service.HolidayService
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.bodyToFlux
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Component
class HolidayClient {

    fun getHoliday(): Mono<Holiday> {
        var client = WebClient.create("http://weholidays.s3.amazonaws.com/ar.json")
        return client
            .get()
            .uri("http://weholidays.s3.amazonaws.com/ar.json")
            .retrieve()
            .bodyToMono(Holiday::class.java)
    }
}