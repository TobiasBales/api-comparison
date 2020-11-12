package net.prettyrandom.apis.users.graphql

import com.expediagroup.graphql.spring.operations.Query
import net.prettyrandom.apis.users.models.User
import net.prettyrandom.apis.users.repositories.UserRepository
import org.springframework.stereotype.Component

@Component
class UserQuery(
        private val userRepository: UserRepository
) : Query {
    fun findById(id: String): User? {
        return userRepository.findById(id).orElseGet { null }
    }
}