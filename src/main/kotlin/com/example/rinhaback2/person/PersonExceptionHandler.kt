package com.example.rinhaback2.person

import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@ControllerAdvice
class PersonExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun messageNotReadable() : Mono<ServerResponse> {
        return ServerResponse.badRequest().build()
    }
}