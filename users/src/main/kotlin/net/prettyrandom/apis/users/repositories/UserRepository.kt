package net.prettyrandom.apis.users.repositories

import net.prettyrandom.apis.users.models.User

interface UserRepository {
    fun findById(id: String): User?
    fun save(user: User): User
}