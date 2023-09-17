package com.example.rinhaback2.othters

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import java.io.IOException


class StackSerializer : JsonSerializer<List<String?>?>() {
    @Throws(IOException::class)
    override fun serialize(stack: List<String?>?, jsonGenerator: JsonGenerator, provider: SerializerProvider) {
        return jsonGenerator.writeString(java.lang.String.join(", ", stack))
    }
}