package net.prettyrandom.apis.websites.graphql

import com.expediagroup.graphql.spring.operations.Mutation
import net.prettyrandom.apis.websites.models.Domain
import net.prettyrandom.apis.websites.models.Website
import net.prettyrandom.apis.websites.repositories.WebsiteRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class CreateWebsiteMutation(
        private val websiteRepository: WebsiteRepository
) : Mutation {
    fun createWebsite(userId: String, title: String, url: String): Website {
        val website = Website(UUID.randomUUID().toString(), mutableListOf(), userId, title)
        val domain = Domain(id = UUID.randomUUID().toString(), url = url, website = website)
        website.domains.add(domain)

        return websiteRepository.save(website)
    }

}