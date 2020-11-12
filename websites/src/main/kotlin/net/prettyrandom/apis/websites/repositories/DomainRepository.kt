package net.prettyrandom.apis.websites.repositories

import net.prettyrandom.apis.websites.models.Domain
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DomainRepository : CrudRepository<Domain, String>