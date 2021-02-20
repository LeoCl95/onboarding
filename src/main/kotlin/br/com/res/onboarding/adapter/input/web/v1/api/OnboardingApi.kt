package br.com.res.onboarding.adapter.input.web.v1.api

import br.com.res.onboarding.adapter.input.web.v1.api.request.LoginRequest
import br.com.res.onboarding.application.domain.Person
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RequestMapping("/v1/res/onboarding", produces = [MediaType.APPLICATION_JSON_VALUE])
interface OnboardingApi {

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    fun insertUser(
        @RequestBody person: Person
    )

    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    fun login(
        @RequestBody login: LoginRequest
    )
}