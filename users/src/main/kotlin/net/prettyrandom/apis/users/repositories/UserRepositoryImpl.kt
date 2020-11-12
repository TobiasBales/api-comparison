package net.prettyrandom.apis.users.repositories

import net.prettyrandom.apis.users.models.User
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl : UserRepository {
    private val users = mutableMapOf<String, User>()

    override fun findById(id: String): User? {
        return users[id]
    }

    override fun save(user: User): User {
        users[user.id] = user

        return user
    }
}