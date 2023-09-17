package com.example.rinhaback2.person

import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Component
import java.sql.ResultSet

@Component
class PersonDaoMapper : RowMapper<Person> {
    override fun mapRow(rs: ResultSet, rowNum: Int): Person? {
        return Person(
            id = rs.getString("id"),
            apelido = rs.getString("nickname"),
            nome = rs.getString("name"),
            nascimento = rs.getString("born_at"),
            stack = rs.getString("stack").split(",")
        )
    }


}