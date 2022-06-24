package com.example.demo.controller

import com.example.demo.service.HolidayService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("holidays")
class HolidayController(private val holidayService: HolidayService) {

    @GetMapping(value = ["/list"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getHoliday() =
        holidayService.getHoliday()
}