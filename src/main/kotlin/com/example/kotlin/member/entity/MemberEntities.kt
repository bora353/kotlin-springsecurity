package com.example.kotlin.member.entity

import com.example.kotlin.common.status.`Gender.kt`
import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(uniqueConstraints = [UniqueConstraint(name = "uk_member_login_id", columnNames = ["loginId"])])
class Member (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, length = 30, updatable = false)
    val loginId: String,

    @Column(nullable = false, length = 100)
    val password: String,

    @Column(nullable = false, length = 10)
    val name: String,

    @Column(nullable = false, length = 30)
    @Temporal(TemporalType.DATE) // 날짜만
    val birthDate: LocalDate,

    @Column(nullable = false, length = 30)
    @Enumerated(EnumType.STRING)
    val gender: `Gender.kt`,

    @Column(nullable = false, length = 30)
    val email: String,
)