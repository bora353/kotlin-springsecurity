package com.example.kotlin.member.entity

import jakarta.persistence.*

@Entity
@Table(uniqueConstraints = [UniqueConstraint(name = "uk_member_login_id", columnNames = ["loginId"])])
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(nullable = false, length = 30, updatable = false)
    val loginId: String,
)