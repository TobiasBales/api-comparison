package net.prettyrandom.apis.users.graphql

import com.expediagroup.graphql.spring.operations.Mutation
import net.prettyrandom.apis.users.models.User
import net.prettyrandom.apis.users.repositories.UserRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class CreateUserMutation(
        private val userRepository: UserRepository
) : Mutation {
    fun createUser(firstName: String, lastName: String, email: String): User {
        val user = User(UUID.randomUUID().toString(), firstName, lastName, email)

        userRepository.save(user)

        return user
    }
}