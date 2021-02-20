package br.com.res.onboarding.application.port.output

import br.com.res.onboarding.adapter.input.web.v1.api.request.LoginRequest
import br.com.res.onboarding.application.domain.Person
import org.springframework.stereotype.Repository

@Repository
interface PersonRepositoryPort {

    fun insertPerson(person: Person)

    fun doLogin(login: LoginRequest)
}