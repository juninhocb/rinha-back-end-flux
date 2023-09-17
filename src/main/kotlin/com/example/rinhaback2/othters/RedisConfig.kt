package com.example.rinhaback2.othters

import com.example.rinhaback2.person.Person
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer
import org.springframework.data.redis.serializer.StringRedisSerializer

@Configuration
class RedisConfig {

    @Bean
    fun redisTemplate(factory: RedisConnectionFactory)
            : RedisTemplate<String, Person> {

        val template = RedisTemplate<String, Person>();

        template.connectionFactory = factory
        template.keySerializer = StringRedisSerializer()

        val jsonSerializer = Jackson2JsonRedisSerializer(Person::class.java)
        template.valueSerializer = jsonSerializer

        return template;
    }
}