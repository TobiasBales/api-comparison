package net.prettyrandom.apis.users.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User(
        @Id
        val id: String,
        val firstName: String,
        val lastName: String,
        val email: String
)