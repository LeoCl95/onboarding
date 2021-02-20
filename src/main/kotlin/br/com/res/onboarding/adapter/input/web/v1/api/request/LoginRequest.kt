package br.com.res.onboarding.adapter.input.web.v1.api.request

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import org.jetbrains.annotations.NotNull

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
data class LoginRequest(

    @field:[NotNull]
    val email: String,

    @field:[NotNull]
    val password: String
)
