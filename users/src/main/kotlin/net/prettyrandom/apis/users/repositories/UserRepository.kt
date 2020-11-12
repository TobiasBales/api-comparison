package net.prettyrandom.apis.users.repositories

import net.prettyrandom.apis.users.models.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<User, String>