package net.prettyrandom.apis.websites.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Domain(
        @Id
        var id: String,
        var url: String,
        @ManyToOne
        var website: Website
)