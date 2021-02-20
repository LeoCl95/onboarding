package br.com.res.onboarding.application.domain

import javax.persistence.*

@Entity
data class Person(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val email: String,

    @Column(nullable = false)
    val password: String

)
