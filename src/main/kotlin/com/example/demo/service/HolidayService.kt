package com.example.demo.service

import com.example.demo.client.HolidayClient
import org.springframework.stereotype.Service


@Service
class HolidayService(private val holidayClient: HolidayClient) {

    fun getHoliday() =
        holidayClient.getHoliday()


}