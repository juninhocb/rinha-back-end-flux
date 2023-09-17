package com.example.rinhaback2.person

import java.util.*

interface PersonRepository {
    fun findById(id: UUID) : Person
    fun save(person: Person) : String
    fun findByCriteria(criteria: String) : List<Person>
    fun count() : Long
}