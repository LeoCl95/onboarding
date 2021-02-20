package br.com.res.onboarding.adapter.input.web.v1.controller

import br.com.res.onboarding.adapter.input.web.v1.api.OnboardingApi
import br.com.res.onboarding.adapter.input.web.v1.api.request.LoginRequest
import br.com.res.onboarding.application.domain.Person
import br.com.res.onboarding.application.port.output.PersonRepositoryPort
import org.springframework.web.bind.annotation.RestController

@RestController
class OnboardingController (
    val personRepositoryPort: PersonRepositoryPort
): OnboardingApi {

    override fun insertUser(person: Person) {
        personRepositoryPort.insertPerson(person)
    }

    override fun login(login: LoginRequest) {
        personRepositoryPort.doLogin(login)
    }

}
