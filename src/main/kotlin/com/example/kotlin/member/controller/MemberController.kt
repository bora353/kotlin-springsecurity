package com.example.kotlin.member.controller

import com.example.kotlin.member.dto.MemberDtoRequest
import com.example.kotlin.member.service.MemberService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/member")
class MemberController (
    private val memberService: MemberService
) {

    /**
     * 회원가입
     */
    fun signUp(@RequestBody memberDtoRequest: MemberDtoRequest): String {
        return memberService.signUp(memberDtoRequest)
    }
}