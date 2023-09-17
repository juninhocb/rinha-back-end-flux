package com.example.rinhaback2.person

import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.RequestPredicates.*
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Component
class PersonRouter(private val personHandler: PersonHandler) {

    companion object {
        private val ACCEPT_JSON = accept(APPLICATION_JSON)
        private val CONTENT_TYPE = contentType(APPLICATION_JSON)
    }

    @Bean
    fun personRoutes() : RouterFunction<ServerResponse> {
        return RouterFunctions
            .route(GET("/pessoas/{id}").and(ACCEPT_JSON), personHandler::findById)
            .andRoute(
            GET("/pessoas").and(ACCEPT_JSON), personHandler::findByCriteria)
            .andRoute(
            GET("/contagem-pessoas").and(ACCEPT_JSON), personHandler::count)
            .andRoute(
            POST("/pessoas").and(CONTENT_TYPE), personHandler::create)

    }

}