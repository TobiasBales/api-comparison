package net.prettyrandom.apis.websites.models

import javax.persistence.*

@Entity
data class Website(
        @Id
        var id: String,
        @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
        var domains: MutableList<Domain>,
        var userId: String,
        var title: String
)