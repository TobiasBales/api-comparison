package net.prettyrandom.apis.websites.graphql

import com.expediagroup.graphql.spring.operations.Query
import net.prettyrandom.apis.websites.models.Website
import net.prettyrandom.apis.websites.repositories.WebsiteRepository
import org.springframework.stereotype.Component

@Component
class WebsiteQuery(
        private val websiteRepository: WebsiteRepository
) : Query {
    fun findById(id: String): Website? {
        return websiteRepository.findById(id).orElseGet { null }
    }
}