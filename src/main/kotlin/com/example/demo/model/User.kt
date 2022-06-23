package com.example.demo.model

import com.fasterxml.jackson.annotation.JsonProperty

data class User(
   @JsonProperty("nombre")
   val name: String,
   val apellido: String
)
