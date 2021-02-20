package br.com.res.onboarding.adapter.output.database.repository

import br.com.res.onboarding.application.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository : JpaRepository<Person, Long> {

    fun findByEmailAndPassword(email: String, password: String): List<Person>
}