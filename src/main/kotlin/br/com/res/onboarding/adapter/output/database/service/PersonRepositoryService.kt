package br.com.res.onboarding.adapter.output.database.service

import br.com.res.onboarding.adapter.input.web.v1.api.request.LoginRequest
import br.com.res.onboarding.adapter.output.database.repository.PersonRepository
import br.com.res.onboarding.application.domain.Person
import br.com.res.onboarding.application.port.output.PersonRepositoryPort
import org.springframework.stereotype.Component

@Component
class PersonRepositoryService(
    val personRepository: PersonRepository
) : PersonRepositoryPort {

    override fun insertPerson(person: Person) {
        verifyAccountExist(person)

        personRepository.save(person)
    }

    override fun doLogin(login: LoginRequest) {
        val email = login.email
        val password = login.password

        val personLogin: List<Person> = personRepository.findByEmailAndPassword(email, password)

        tryLogon(personLogin, email, password)
    }

    private fun tryLogon(
        personLogin: List<Person>,
        email: String,
        password: String
    ) {
        personLogin.firstOrNull()?.let { person ->
            if (email == person.email || password == person.password) return
        }

        throw Exception()
    }

    private fun verifyAccountExist(person: Person) {
        val persons = personRepository.findAll()

        if (persons.find { it.email == person.email } != null) throw Exception()

    }

}