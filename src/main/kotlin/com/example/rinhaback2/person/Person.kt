package com.example.rinhaback2.person

import com.fasterxml.jackson.annotation.JsonProperty

data class Person (
    @JsonProperty("id")
    val id: String?,
    @JsonProperty("apelido")
    val apelido: String,
    @JsonProperty("nome")
    val nome: String,
    @JsonProperty("nascimento")
    val nascimento: String,
    @JsonProperty("stack")
    val stack: List<String>?
)