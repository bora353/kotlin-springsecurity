package com.example.kotlin.member.dto

import com.example.kotlin.common.status.`Gender.kt`
import java.time.LocalDate

data class MemberDtoRequest(
    val id:Long?,
    val loginId: String,
    val password: String,
    val name: String,
    val birthDate: LocalDate,
    val gender: `Gender.kt`,
    val email: String
)
