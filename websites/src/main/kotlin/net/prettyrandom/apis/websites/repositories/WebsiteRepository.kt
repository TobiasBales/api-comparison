package net.prettyrandom.apis.websites.repositories

import net.prettyrandom.apis.websites.models.Website
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface WebsiteRepository : CrudRepository<Website, String>